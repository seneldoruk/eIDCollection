import { cookies } from "next/headers";
import { NextRequest, NextResponse } from "next/server";
import { ascii_to_hex, getResult } from "../soapUtils";
import { signJWT, signeIDJWT, verifyJWT } from "@/lib/jwtutils";
import { db } from "@/db/db";
import { user } from "@/db/schema";
import { eq } from "drizzle-orm";

export const dynamic = "force-dynamic"; // defaults to auto
export async function GET(request: NextRequest) {
  const searchParams = request.nextUrl.searchParams;

  if (!searchParams.has("ResultMajor")) {
    return NextResponse.json(
      {},
      { status: 302, headers: { Location: request.url } },
    );
  }

  const sessionID = searchParams.get("session")!;
  const sessionIDHex = ascii_to_hex(sessionID);

  const { name, surname, dateOfBirth } = await getResult(sessionIDHex);
  const { email } = await verifyJWT(cookies().get("jwt")?.value!);
  const {
    name: dbName,
    surname: dbSurname,
    dateOfBirth: dbDoB,
  } = (await db.select().from(user).where(eq(user.email, email)).execute())[0];

  if (dbName !== name || dbSurname !== surname || dbDoB !== dateOfBirth) {
    return NextResponse.redirect(new URL("/login", request.url));
  }

  const jwt = await signJWT(email, 2);
  cookies().set("jwt", jwt);

  return NextResponse.redirect(new URL("/", request.url));
}
