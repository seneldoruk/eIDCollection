import { drizzle, BetterSQLite3Database } from "drizzle-orm/better-sqlite3";
import Database from "better-sqlite3";
import { migrate } from "drizzle-orm/better-sqlite3/migrator";
import { user } from "./schema";

const sqlite = new Database(":memory:");
export const db: BetterSQLite3Database = drizzle(sqlite);

migrate(db, { migrationsFolder: "./src/db/codegen" });
db.insert(user)
  .values({
    name: "John",
    surname: "Doe",
    email: "test@test.com",
    password: "test@test.com",
    dateOfBirth: "1990-01-01",
  })
  .execute();
