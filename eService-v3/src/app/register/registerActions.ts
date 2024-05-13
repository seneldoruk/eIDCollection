"use server";
import { db } from "@/db/db";
import { registerSchema } from "./registerSchema";
import { user } from "@/db/schema";
import { cookies } from "next/headers";
import { verifyeIDJWT } from "@/lib/jwtutils";

export async function registerAction(data: FormData) {
  const obj = Object.fromEntries(data);
  const { data: formData, success, error } = registerSchema.safeParse(obj);
  if (!success) {
    return { message: error.errors };
  }
  try {
    const { name, surname, dateOfBirth } = await verifyeIDJWT(
      cookies().get("eid-jwt")?.value!,
    );
    console.log("Inside register action: ", name, surname, dateOfBirth);
    const data = { ...formData, name, surname, dateOfBirth };
    const res = await db.insert(user).values(data);
    console.log("Db changes:", res.changes);
    return { message: "success" };
  } catch (e: any) {
    return { message: e.message };
  }
}
