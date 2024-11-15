"use server";
import { cookies } from "next/headers";
import { verifyJWT } from "@/lib/jwtutils";
import { redirect } from "next/navigation";
import { db } from "@/db/db";
import { user } from "@/db/schema";
import { eq } from "drizzle-orm";
import { CardHeader, CardTitle, CardContent } from "@/components/ui/card";
import { Input } from "@/components/ui/input";
import { Label } from "@/components/ui/label";

const LabelAndInput = ({
  label,
  value,
  className,
}: {
  label: string;
  value: string;
  className?: string;
}) => (
  <div className={className}>
    <Label htmlFor={label}>{label}</Label>
    <Input id={label} disabled defaultValue={value} />
  </div>
);

export default async function Home() {
  const jwt = cookies().get("jwt")?.value;
  if (!jwt) redirect("/login");

  const { email: verifiedEmail, factor } = await verifyJWT(jwt);
  if (!verifiedEmail || factor !== 2) {
    redirect("/login");
  }
  const dbuser = (
    await db.select().from(user).where(eq(user.email, verifiedEmail))
  )[0];
  if (!dbuser) return redirect("/login");
  const { name, surname, email, dateOfBirth } = dbuser;

  return (
    <>
      <CardHeader>
        <CardTitle>Your Data</CardTitle>
      </CardHeader>
      <CardContent>
        <div className="flex flex-row">
          <LabelAndInput label="Name" value={name!} className="mr-1" />
          <LabelAndInput label="Surname" value={surname!} />
        </div>
        <div className="flex flex-row">
          <LabelAndInput label="Email" value={email!} className="mr-1" />
          <LabelAndInput label="Date of Birth" value={dateOfBirth!} />
        </div>
      </CardContent>
    </>
  );
}
