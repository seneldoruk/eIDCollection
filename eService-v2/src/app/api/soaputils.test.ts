import { getXMLValue } from "./soapUtils";
import { expect, test } from "bun:test";

const getResultExample = `
<SOAP-ENV:Envelope
	xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
	<SOAP-ENV:Header/>
	<SOAP-ENV:Body>
		<GetResultResponseType
			xmlns:ns2="http://bsi.bund.de/eID/"
			xmlns:ns3="urn:oasis:names:tc:dss:1.0:core:schema"
			xmlns:ns4="http://www.w3.org/2000/09/xmldsig#">
			<ns2:PersonalData>
				<ns2:DocumentType>AR</ns2:DocumentType>
				<ns2:IssuingState>D</ns2:IssuingState>
				<ns2:GivenNames>Doruk</ns2:GivenNames>
				<ns2:FamilyNames>SENEL</ns2:FamilyNames>
				<ns2:ArtisticName/>
				<ns2:AcademicTitle/>
				<ns2:DateOfBirth>
					<ns2:DateString>2024-06-10+02:00</ns2:DateString>
				</ns2:DateOfBirth>
				<ns2:PlaceOfBirth>
					<ns2:FreetextPlace>FATIH</ns2:FreetextPlace>
				</ns2:PlaceOfBirth>
				<ns2:Nationality>TUR</ns2:Nationality>
				<ns2:RestrictedID>
					<ns2:ID>6D6F636B</ns2:ID>
				</ns2:RestrictedID>
			</ns2:PersonalData>
			<ns3:Result>
				<ns3:ResultMajor>http://www.bsi.bund.de/ecard/api/1.1/resultmajor#ok</ns3:ResultMajor>
			</ns3:Result>
		</GetResultResponseType>
	</SOAP-ENV:Body>
</SOAP-ENV:Envelope>
`;
test("GivenNames", () => {
  const xml = getResultExample;
  const tag = "GivenNames";
  const wrappedBy = "PersonalData";
  const res = getXMLValue(xml, tag, wrappedBy);
  expect(res.toLocaleLowerCase()).toBe("doruk");
});

test("FamilyNames", () => {
  const xml = getResultExample;
  const tag = "FamilyNames";
  const wrappedBy = "PersonalData";
  const res = getXMLValue(xml, tag, wrappedBy);
  expect(res.toLocaleLowerCase()).toBe("senel");
});

test("DateOfBirth", () => {
  const xml = getResultExample;
  const tag = "DateString";
  const wrappedBy = "DateOfBirth";
  const res = getXMLValue(xml, tag, wrappedBy).split("+")[0];
  console.log(res);
  expect(res).toBe("2024-06-10");
});