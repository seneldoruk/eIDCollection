import { cookies } from "next/headers";
import { NextRequest, NextResponse } from "next/server";
import { ascii_to_hex, getResult } from "../soapUtils";
import { signeIDJWT } from "@/lib/jwtutils";

export const dynamic = "force-dynamic"; // defaults to auto
export async function GET(request: NextRequest) {
  const searchParams = request.nextUrl.searchParams;

  if(!searchParams.has("ResultMajor")){
    return NextResponse.json({}, { status: 302, headers: { Location: request.url }});
  }

  const sessionID = searchParams.get("session")!;
  const sessionIDHex = ascii_to_hex(sessionID);

  const { name, surname, dateOfBirth } = await getResult(sessionIDHex);
  const jwt = await signeIDJWT(name, surname, dateOfBirth);
  cookies().set("eid-jwt", jwt);

  console.log(name, surname, dateOfBirth);
  console.log(sessionID);

  return NextResponse.redirect(new URL("/register", request.url));
}