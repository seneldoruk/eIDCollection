"use client";
import { Button } from "@/components/ui/button";
import {
  CardHeader,
  CardTitle,
  CardContent,
  CardFooter,
} from "@/components/ui/card";
import {
  FormField,
  FormItem,
  FormLabel,
  FormControl,
  FormDescription,
  Form,
  FormMessage,
} from "@/components/ui/form";
import { cn } from "@/lib/utils";
import { zodResolver } from "@hookform/resolvers/zod";
import { Input } from "@/components/ui/input";
import { useForm } from "react-hook-form";
import { z } from "zod";
import GenericFormField from "../genericFormField";
import { registerSchema } from "./registerSchema";
import Link from "next/link";
import { registerAction } from "./registerActions";
import { useRouter } from "next/router";

export default function LoginForm() {
  const registerForm = useForm<z.infer<typeof registerSchema>>({
    resolver: zodResolver(registerSchema),
  });
  const onSubmit = async (data: z.infer<typeof registerSchema>) => {
    const formdata = new FormData();
    formdata.append("name", data.name);
    formdata.append("surname", data.surname);
    formdata.append("email", data.email);
    formdata.append("password", data.password);
    formdata.append("dateOfBirth", data.dateOfBirth);
    const res = await registerAction(formdata);
    if (res.message === "success") {
      window.location.href = "/login";
    } else {
      registerForm.setError("password", { message: res.message });
    }
  };
  return (
    <>
      <CardHeader>
        <CardTitle>Register</CardTitle>
      </CardHeader>
      <Form {...registerForm}>
        <form
          onSubmit={registerForm.handleSubmit((data) => {
            onSubmit(data);
          })}
        >
          <CardContent>
            <div className="flex flex-row">
              <GenericFormField
                form={registerForm}
                label="Name"
                className="mr-1"
              />
              <GenericFormField form={registerForm} label="Surname" />
            </div>
            <GenericFormField
              form={registerForm}
              label="Date of Birth"
              fieldName="dateOfBirth"
              type="date"
            />
            <GenericFormField form={registerForm} label="Email" type="email" />
            <GenericFormField
              form={registerForm}
              label="Password"
              type="password"
            />
          </CardContent>
          <CardFooter className={cn("flex flex-col")}>
            <Button className="w-full m-1">Register</Button>
            <Button variant="outline" asChild className="w-full m-1">
              <Link href="/login">Login</Link>
            </Button>
          </CardFooter>
        </form>
      </Form>
    </>
  );
}
