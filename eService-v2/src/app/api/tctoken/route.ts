export const dynamic = "force-dynamic"; // defaults to auto
export async function GET(request: Request) {
  const serverAddress =
    "https://prodpaos.governikus-eid.de:443/ecardpaos/paosreceiver";
  const sessionID = "9e1eda38-86d7-46d1-a1ee-8c36296acec3";
  const refreshAddress = new URL(
    `/api/authcomplete?session=${sessionID}`,
    request.url
  ).toString();
  const psk =
    "6377A17AA9B0A2F7DB53EBDCDF87092E1DBEDBCCCA797A887316FC5722488BA48CF6B9699DA3BE4CD6834780BC53907CBDC08C27E12BA033CD1781F16D8FA2BE";
  const token = Buffer.from(`<TCTokenType>
    <ServerAddress>${serverAddress}</ServerAddress>
    <SessionIdentifier>${sessionID}</SessionIdentifier>
    <RefreshAddress>${refreshAddress}</RefreshAddress>
    <Binding>urn:liberty:paos:2006-08</Binding>
    <PathSecurity-Protocol>urn:ietf:rfc:4279</PathSecurity-Protocol>
    <PathSecurity-Parameter>
        <PSK>${psk}</PSK>
    </PathSecurity-Parameter>
</TCTokenType>`);
  return new Response(token, {
    status: 200,
    headers: {
      "Content-Type": "text/xml",
    },
  });
}
