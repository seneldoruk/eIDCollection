"use server";
import { db } from "@/db/db";
import { loginSchema } from "./loginSchema";
import { user } from "@/db/schema";
import { eq } from "drizzle-orm";
import { signJWT } from "@/lib/jwtutils";
import { cookies } from "next/headers";
import { redirect } from "next/navigation";

export async function loginAction(data: FormData) {
  const obj = Object.fromEntries(data);
  const parsed = loginSchema.safeParse(obj);
  if (!parsed.success) {
    return { message: parsed.error.errors };
  }
  const userInDb = (
    await db.select().from(user).where(eq(user.email, parsed.data.email))
  )[0];
  if (!userInDb) return { message: "User not found" };
  if (userInDb.password !== parsed.data.password) {
    return { message: "Invalid password" };
  }
  const jwt = await signJWT(userInDb.email, 1);
  cookies().set("jwt", jwt);
  return { message: "success" };
}
