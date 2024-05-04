import { cookies } from "next/headers";
import RegisterForm from "./registerForm";
import { redirect } from "next/navigation";

export default function Register() {
  if (!cookies().get("eid-jwt")?.value) {
    redirect("login");
  }
  return <RegisterForm />;
}
