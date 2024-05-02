package com.example.eidservermock;

import org.apache.tomcat.util.buf.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

;

public class TCTokenUtils {
    public static String getRawTCToken() throws IOException {
        URL url = new URL("https://www.autentapp.de/AusweisAuskunft/WebServiceRequesterServlet");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();
        return String.valueOf(content);
    }

    public static String stringBetweenStrings(String str, String startStr, String endStr) {
        int startPos = str.indexOf(startStr) + startStr.length();
        int endPos = str.indexOf(endStr);
        return str.substring(startPos, endPos);
    }

    public static TCTokenFieldsDTO getTCTokenFields() {
        try {
            String token = getRawTCToken();
            String refreshAddress = stringBetweenStrings(token, "<RefreshAddress>", "</RefreshAddress>");
            String session = stringBetweenStrings(token, "<SessionIdentifier>", "</SessionIdentifier>");
            String server = stringBetweenStrings(token, "<ServerAddress>", "</ServerAddress>");
            String psk = stringBetweenStrings(token, "<PSK>", "</PSK>");
            return new TCTokenFieldsDTO(server, psk, session, refreshAddress);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String hexToAscii(String hexStr) {
        StringBuilder output = new StringBuilder("");

        for (int i = 0; i < hexStr.length(); i += 2) {
            String str = hexStr.substring(i, i + 2);
            output.append((char) Integer.parseInt(str, 16));
        }

        return output.toString();
    }


}
