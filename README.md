# eIDCollection
Collection of code, docs, etc. that I've used as part of my bachelor thesis on eID in Germany

## Directories

### eID-Server-Codegen
Generated with xjc, basically using `./xjc.sh TR-03130eID-Server.xsd`. The xsd file comes from [BSI TR-03130 eID-Server](https://www.bsi.bund.de/DE/Themen/Unternehmen-und-Organisationen/Standards-und-Zertifizierung/Technische-Richtlinien/TR-nach-Thema-sortiert/tr03130/TR-03130_node.html) but the file `external/oasis-dss-core-schema-v1.0-os.xsd` has an error since the url `http://www.oasis-open.org/committees/download.php/3408/oasis-sstc-saml-schema-protocol-1.1.xsd` was moved to `https://groups.oasis-open.org/higherlogic/ws/public/download/3408/oasis-sstc-saml-schema-assertion-1.1.xsd`, which should be replaced as such in the file before running xjc.

### eID-Client-Mock
A fork of [Governikus/AusweisApp](https://github.com/Governikus/AusweisApp) with the security checks made in `StateCertificateDescriptionCheck`, `CertificateChecker.cpp`, `UrlUtil` and `StateCheckCertificates` disabled. Diffs can be found [here](eID-Client-Mock/DIFF.md).

### eID-Server-Mock
A SOAP server that implements useID and getResult functions for an eService to read the data of an eID. It does not actually read any data and does something like a Man-in-the-Middle attack to an existing eID-Server. More on that [here](eID-Server-Mock/README.md).

### eService-v1
A simple web site with login and register functionality using email, password and JSON Web Token.

### eService-v2
Building on v1, this version integrates eID function using the eID-Server.