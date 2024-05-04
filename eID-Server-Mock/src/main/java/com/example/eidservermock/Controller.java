package com.example.eidservermock;

import jakarta.xml.bind.JAXBElement;
import org.springframework.web.client.RestClient;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import wsdl.de.bund.bsi.eid.*;
import wsdl.oasis.names.tc.dss._1_0.core.schema.Result;

import javax.xml.namespace.QName;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@Endpoint
public class Controller {
    StoreRepository repository;
    public Controller(StoreRepository repository
    ) {
        this.repository = repository;
    }
    private static final String NAMESPACE_URI = "http://bsi.bund.de/eID/";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "useIDRequest")
    @ResponsePayload
    public JAXBElement<UseIDResponseType> useID(@RequestPayload JAXBElement<UseIDRequestType> request) {
        var res = new UseIDResponseType();
        var token = TCTokenUtils.getTCTokenFields();
        System.out.println("token: " + token.toString());
        repository.save(new KVStore(token.refreshAddress(),token.session()));


        res.setECardServerAddress(token.serverAddress());

        var psk = new PreSharedKeyType();
        psk.setID(token.psk());
        psk.setKey("mock".getBytes(StandardCharsets.UTF_8));
        res.setPSK(psk);

        var session = new SessionType();
        session.setID(token.session().getBytes());
        res.setSession(session);

        var result = new Result();
        result.setResultMajor("http://www.bsi.bund.de/ecard/api/1.1/resultmajor#ok");
        res.setResult(result);

        return createJaxbElement(res, UseIDResponseType.class);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getResultRequest")
    @ResponsePayload
    public JAXBElement<GetResultResponseType> getResult(@RequestPayload JAXBElement<GetResultRequestType> request) {
        var session = request.getValue().getSession().getID();
        var sessionStr = TCTokenUtils.hexToAscii(session);
        var resultAddress = repository.findById(sessionStr).get().refreshUrl + "&mode=json";

        RestClient restClient = RestClient.create();
        var resFromServer = restClient.get()
                .uri(resultAddress).retrieve()
                .body(ResultDTO.class);
        assert resFromServer != null;


        var res = new GetResultResponseType();
        var resulttype = new Result();
        resulttype.setResultMajor("http://www.bsi.bund.de/ecard/api/1.1/resultmajor#ok");
        res.setResult(resulttype);

        res.setPersonalData(mapPersonalData(resFromServer.personalData));
        return createJaxbElement(res, GetResultResponseType.class);
    }

    private PersonalDataType mapPersonalData(PersonalData personalData) {
        var res = new PersonalDataType();
        res.setDocumentType(personalData.documentType);
        res.setIssuingState(personalData.issuingState);
        res.setGivenNames(personalData.givenNames);
        res.setFamilyNames(personalData.familyNames);
        res.setArtisticName(personalData.artisticName);
        res.setAcademicTitle(personalData.academicTitle);
        var placeOfBirth = new GeneralPlaceType();
        placeOfBirth.setFreetextPlace(personalData.placeOfBirth.freetextPlace);
        res.setPlaceOfBirth(placeOfBirth);
        res.setNationality(personalData.nationality);
        var dateOfBirth = new GeneralDateType();
        dateOfBirth.setDateString(personalData.dateOfBirth);
        res.setDateOfBirth(dateOfBirth);
        var restrictedIdtype = new RestrictedIDType();
        restrictedIdtype.setID("mock".getBytes());
        res.setRestrictedID(restrictedIdtype);
        return res;
    }

    private <T> JAXBElement<T> createJaxbElement(T object, Class<T> clazz) {
        return new JAXBElement<>(new QName(clazz.getSimpleName()), clazz, object);
    }


}
