"use server";
import * as jose from "jose";

const secret = new TextEncoder().encode(
  "cc7e0d44fd473002f1c42167459001140ec6389b7353f8088f4d9a95f2f596f2",
);
const alg = "HS256";

export async function signJWT(email: string, factor: number) {
  return await new jose.SignJWT({ "urn:example:claim": true })
    .setSubject(JSON.stringify({ email, factor }))
    .setProtectedHeader({ alg })
    .setIssuedAt()
    .setExpirationTime(factor === 1 ? "5m" : "1d")
    .sign(secret);
}

export async function verifyJWT(token: string) {
  const res = await jose.jwtVerify(token, secret);
  return JSON.parse(res.payload.sub!) as {
    email: string;
    factor: number;
  };
}

export async function signeIDJWT(
  name: string,
  surname: string,
  dateOfBirth: string,
) {
  return await new jose.SignJWT({ "urn:example:claim": true })
    .setSubject(
      JSON.stringify({
        name,
        surname,
        dateOfBirth,
      }),
    )
    .setProtectedHeader({ alg })
    .setIssuedAt()
    .setExpirationTime("5m")
    .sign(secret);
}

export async function verifyeIDJWT(token: string) {
  const res = await jose.jwtVerify(token, secret);
  return JSON.parse(res.payload.sub!) as {
    name: string;
    surname: string;
    dateOfBirth: string;
  };
}
