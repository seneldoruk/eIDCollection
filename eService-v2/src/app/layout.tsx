import type { Metadata } from "next";
import "@/app/globals.css";
import { Inter as FontSans } from "next/font/google";

import { cn } from "@/lib/utils";
import { Card } from "@/components/ui/card";

const fontSans = FontSans({
  subsets: ["latin"],
  variable: "--font-sans",
});

export const metadata: Metadata = {
  title: "eService",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en">
      <body
        className={cn(
          "min-h-screen bg-background font-sans antialiased flex align-middle items-center justify-center",
          fontSans.variable
        )}
      >
        <Card className="min-w-80 max-w-full">{children}</Card>
      </body>
    </html>
  );
}
