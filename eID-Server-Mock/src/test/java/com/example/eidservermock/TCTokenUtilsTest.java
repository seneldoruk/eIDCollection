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
        assertEquals(TCTokenUtils.hexToAscii("30323032633435342D656138612D343236322D623930652D653237613932323239333064"), "0202c454-ea8a-4262-b90e-e27a9222930d");
    }
}