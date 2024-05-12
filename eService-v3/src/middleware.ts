import { redirect } from "next/navigation";
import { NextResponse } from "next/server";
import type { NextRequest } from "next/server";

export function middleware(request: NextRequest) {
  if (
    request.nextUrl.pathname === "/login" ||
    request.nextUrl.pathname === "/register"
  ) {
    request.cookies.delete("jwt");
  }
  if (request.nextUrl.pathname === "/" && !request.cookies.get("jwt")) {
    return NextResponse.redirect(new URL("/login", request.url));
  }
}
