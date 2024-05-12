"use client";
import { Button } from "@/components/ui/button";
import {
  CardHeader,
  CardTitle,
  CardContent,
  CardFooter,
} from "@/components/ui/card";
import { Form } from "@/components/ui/form";
import { cn } from "@/lib/utils";
import { zodResolver } from "@hookform/resolvers/zod";
import { Input } from "@/components/ui/input";
import { useForm } from "react-hook-form";
import { z } from "zod";
import { loginAction } from "./loginActions";
import { loginSchema } from "./loginSchema";
import GenericFormField from "../genericFormField";
import Link from "next/link";
import { redirect } from "next/navigation";

export default function LoginForm() {
  const loginForm = useForm<z.infer<typeof loginSchema>>({
    resolver: zodResolver(loginSchema),
  });
  const onSubmit = async (data: z.infer<typeof loginSchema>) => {
    const formdata = new FormData();
    formdata.append("email", data.email);
    formdata.append("password", data.password);
    const res = await loginAction(formdata);
    loginForm.setError("password", {
      type: "custom",
      message: (res as any).message,
    });
  };
  return (
    <>
      <CardHeader>
        <CardTitle>Login</CardTitle>
      </CardHeader>
      <Form {...loginForm}>
        <form onSubmit={loginForm.handleSubmit(onSubmit)}>
          <CardContent>
            <GenericFormField form={loginForm} label="Email" type="email" />
            <GenericFormField
              form={loginForm}
              label="Password"
              type="password"
            />
          </CardContent>
          <CardFooter className={cn("flex flex-col")}>
            <Button className="w-full m-1">Login</Button>
            <Button variant="outline" asChild className="w-full m-1">
              <a
                href={`http://127.0.0.1:24727/eID-Client?tcTokenURL=${window.location.origin}/api/tctoken`}
              >
                Register with eID
              </a>
            </Button>
          </CardFooter>
        </form>
      </Form>
    </>
  );
}
