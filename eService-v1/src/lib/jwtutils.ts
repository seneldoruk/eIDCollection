"use server";
import * as jose from "jose";

const secret = new TextEncoder().encode(
  "cc7e0d44fd473002f1c42167459001140ec6389b7353f8088f4d9a95f2f596f2"
);
const alg = "HS256";

export async function signJWT(email: string) {
  return await new jose.SignJWT({ "urn:example:claim": true })
    .setSubject(email)
    .setProtectedHeader({ alg })
    .setIssuedAt()
    .setExpirationTime("1d")
    .sign(secret);
}

export async function verifyJWT(token: string) {
  const res = await jose.jwtVerify(token, secret);
  return res.payload.sub;
}