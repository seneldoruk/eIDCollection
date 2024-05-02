import { z } from "zod";

export const registerSchema = z.object({
  email: z.string().email({ message: "Invalid email" }),
  password: z
    .string()
    .min(6, { message: "Password must be at least 6 characters" }),
  name: z.string().min(2, { message: "Name must be at least 2 characters" }),
  surname: z
    .string()
    .min(2, { message: "Surname must be at least 2 characters" }),
  dateOfBirth: z.string().refine(
    (dateOfBirth) => {
      const date = new Date(dateOfBirth);
      if (
        new Date().getTime() - date.getTime() <
        18 * 365 * 1000 * 60 * 60 * 24
      ) {
        return false;
      }
      return !isNaN(date.getTime());
    },
    { message: "Must be at least 18 years old" }
  ),
});
