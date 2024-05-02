import {
  FormField,
  FormItem,
  FormLabel,
  FormControl,
  FormMessage,
} from "@/components/ui/form";
import { Input } from "@/components/ui/input";
import loginForm from "./login/loginForm";
import { UseFormReturn } from "react-hook-form";
import { HTMLInputTypeAttribute } from "react";
import { Label } from "@radix-ui/react-label";

interface GenericFormFieldProps {
  form: UseFormReturn<any>;
  type?: HTMLInputTypeAttribute;
  label: string;
  fieldName?: string;
  placeholder?: string;
  className?: string;
}
export default function GenericFormField({
  form,
  label,
  fieldName = label.toLocaleLowerCase(),
  type = "text",
  placeholder = label,
  className,
}: GenericFormFieldProps) {
  return (
    <FormField
      control={form.control}
      name={fieldName}
      render={({ field }) => (
        <FormItem className={className}>
          <FormLabel>{label}</FormLabel>
          <FormControl>
            <Input type={type} placeholder={placeholder} {...field} />
          </FormControl>
          <FormMessage />
        </FormItem>
      )}
    ></FormField>
  );
}
