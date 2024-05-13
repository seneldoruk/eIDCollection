import { NextRequest } from "next/server";
import { useID } from "../soapUtils";

export const dynamic = "force-dynamic"; // defaults to auto
export async function GET(request: NextRequest) {
  const { session, psk } = await useID();

  const serverAddress =
    "https://prodpaos.governikus-eid.de:443/ecardpaos/paosreceiver";

  const tctokenfor = request.nextUrl.searchParams.get("for");
  const refreshAddress = new URL(
    `/api/${tctokenfor === "login" ? "logincomplete" : "authcomplete"}?session=${session}`,
    request.url,
  ).toString();

  const token = Buffer.from(`<TCTokenType>
    <ServerAddress>${serverAddress}</ServerAddress>
    <SessionIdentifier>${session}</SessionIdentifier>
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
