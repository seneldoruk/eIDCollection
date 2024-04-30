package com.example.eidservermock;

import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import wsdl.de.bund.bsi.eid.GetResultRequestType;
import wsdl.de.bund.bsi.eid.GetResultResponseType;
import wsdl.de.bund.bsi.eid.UseIDRequestType;
import wsdl.de.bund.bsi.eid.UseIDResponseType;

import javax.xml.namespace.QName;
import java.util.Arrays;

@Endpoint
public class Controller {
    private static final String NAMESPACE_URI = "http://bsi.bund.de/eID/";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "useIDRequest")
    @ResponsePayload
    public JAXBElement<UseIDResponseType> useID(@RequestPayload JAXBElement<UseIDRequestType> request){
        System.out.println("Here");
        var res = new UseIDResponseType();
        res.setECardServerAddress("Hi");
        return createJaxbElement(res, UseIDResponseType.class);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getResultRequest")
    @ResponsePayload
    public JAXBElement<GetResultResponseType> getResult(@RequestPayload JAXBElement<GetResultRequestType> request){
        return null;
    }
    private <T> JAXBElement<T> createJaxbElement(T object, Class<T> clazz) {
        return new JAXBElement<>(new QName(clazz.getSimpleName()), clazz, object);
    }


}
