import type { Config } from "drizzle-kit";

export default {
  schema: "./src/db/schema.ts",
  out: "./src/db/codegen",
  driver: "better-sqlite",
  dbCredentials: {
    url: ":memory:",
  },
} satisfies Config;
