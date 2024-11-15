package com.example.eidservermock;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TCTokenUtilsTest {

    @Test
    void getTCToken() throws IOException {
        String str = TCTokenUtils.getRawTCToken();
        assert (str.startsWith("<TCTokenType><ServerAddress>"));
    }

    @Test
    void stringBetweenStrings() {
        assertEquals(TCTokenUtils.stringBetweenStrings("AAAABBCCCC", "AAAA", "CCCC"), "BB");
    }

    @Test
    void getTCTokenFields() {
        var token = TCTokenUtils.getTCTokenFields();
        assertEquals(token.serverAddress(), "https://prodpaos.governikus-eid.de:443/ecardpaos/paosreceiver");
        assert (token.refreshAddress().startsWith("https://www.autentapp.de/AusweisAuskunft/WebServiceReceiverServlet"));
    }

    @Test
    void hexToAscii() {
        var str = "mock";
        var bytes = str.getBytes();
        var hexToAscii = TCTokenUtils.hexToAscii(bytes);
        assert (hexToAscii.startsWith("mock"));
    }
}