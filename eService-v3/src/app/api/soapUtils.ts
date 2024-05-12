import "../../envConfig";

const useIDRequest = `<?xml version="1.0" encoding="UTF-8"?>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:eid="http://bsi.bund.de/eID/">
	<soapenv:Header />
	<soapenv:Body>
		<eid:useIDRequest>
			<eid:UseOperations>
				<eid:GivenNames>REQUIRED</eid:GivenNames>
				<eid:FamilyNames>REQUIRED</eid:FamilyNames>
				<eid:DateOfBirth>REQUIRED</eid:DateOfBirth>
			</eid:UseOperations>
			<eid:TransactionAttestationRequest>
				<eid:TransactionAttestationFormat>
					http://bsi.bund.de/eID/ExampleAttestationFormat
				</eid:TransactionAttestationFormat>
				<eid:TransactionContext>id599456-df</eid:TransactionContext>
			</eid:TransactionAttestationRequest>
			<eid:LevelOfAssuranceRequest>
				http://bsi.bund.de/eID/LoA/hoch
			</eid:LevelOfAssuranceRequest>
			<eid:EIDTypeRequest>
				<eid:SECertified>ALLOWED</eid:SECertified>
				<eid:SEEndorsed>ALLOWED</eid:SEEndorsed>
			</eid:EIDTypeRequest>
		</eid:useIDRequest>
	</soapenv:Body>
</soapenv:Envelope>`;

const getResultRequest = (
  session: string
) => `<?xml version="1.0" encoding="UTF-8"?>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:eid="http://bsi.bund.de/eID/">
	<soapenv:Header />
	<soapenv:Body>
		<eid:getResultRequest>
			<eid:Session>
				<eid:ID>${session}</eid:ID>
			</eid:Session>
			<eid:RequestCounter>1</eid:RequestCounter>
		</eid:getResultRequest>
	</soapenv:Body>
</soapenv:Envelope>
`;

const serverUrl = process.env.EID_SERVER_URL!;

const soapRequest = async (body: string) => {
  const res = await fetch(serverUrl, {
    method: "POST",
    body: Buffer.from(body),
    headers: { "Content-Type": "text/xml" },
  });
  return res.text();
};

export const getXMLValue = (xml: string, tag: string, wrappedBy: string) => {
  const xmlStartingWithWrapper = xml.substring(
    xml.indexOf(wrappedBy) + wrappedBy.length + 1,
    xml.length
  );
  const startIndex =
    xmlStartingWithWrapper.indexOf(`:${tag}>`) + tag.length + 2;
  const endIndex = xmlStartingWithWrapper.substring(startIndex).indexOf(`</`)+startIndex;
  console.log(startIndex, endIndex);
  return xmlStartingWithWrapper.substring(startIndex, endIndex);
};

function hex_to_ascii(str1: string) {
  var hex = str1.toString();
  var str = "";
  for (var n = 0; n < hex.length; n += 2) {
    str += String.fromCharCode(parseInt(hex.substr(n, 2), 16));
  }
  return str;
}
export function ascii_to_hex(str: string) {
  var arr1 = [];
  for (var n = 0, l = str.length; n < l; n++) {
    var hex = Number(str.charCodeAt(n)).toString(16);
    arr1.push(hex);
  }
  return arr1.join("");
}

export const useID = async () => {
  const res = await soapRequest(useIDRequest);
  console.log("useID:", res);
  const session = hex_to_ascii(getXMLValue(res, "ID", "Session"));
  const psk = getXMLValue(res, "ID", "PSK");

  return { session, psk };
};

export const getResult = async (session: string) => {
  const hexSession = ascii_to_hex(session);
  const res = await soapRequest(getResultRequest(session));
  console.log(res);
  const name = getXMLValue(res, "GivenNames", "PersonalData");
  const surname = getXMLValue(res, "FamilyNames", "PersonalData");
  const dateOfBirth = getXMLValue(res, "DateString", "DateOfBirth").split("+")[0];
  return { name, surname, dateOfBirth };
};
