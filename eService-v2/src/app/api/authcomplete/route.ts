import { cookies } from "next/headers";
import { NextRequest, NextResponse } from "next/server";

export const dynamic = "force-dynamic"; // defaults to auto
export async function GET(request: NextRequest) {
  const searchParams = request.nextUrl.searchParams;
  const sessionID = searchParams.get("session");
  //   cookies().set("jwt", "");
  return NextResponse.redirect(new URL("/", request.url));
}
