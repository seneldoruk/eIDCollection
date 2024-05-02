import { integer, sqliteTable, text } from "drizzle-orm/sqlite-core";

export const user = sqliteTable("user", {
  name: text("name"),
  surname: text("surname"),
  email: text("email").primaryKey(),
  password: text("password"),
  dateOfBirth: text("dateOfBirth"),
});
