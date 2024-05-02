"use server";
import { db } from "@/db/db";
import { registerSchema } from "./registerSchema";
import { user } from "@/db/schema";
import { redirect } from "next/navigation";

export async function registerAction(data: FormData) {
  const obj = Object.fromEntries(data);
  const parsed = registerSchema.safeParse(obj);
  if (!parsed.success) {
    return { message: parsed.error.errors };
  }
  try {
    const res = await db.insert(user).values(parsed.data);
    console.log(res.changes);
    return { message: "success" };
  } catch (e: any) {
    return { message: e.message };
  }
}
