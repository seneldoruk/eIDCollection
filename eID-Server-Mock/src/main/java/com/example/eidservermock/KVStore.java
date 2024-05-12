package com.example.eidservermock;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class KVStore {
    String refreshUrl;
    @Id
    String sessionID;

    public KVStore(String refreshUrl, String sessionID) {
        this.refreshUrl = refreshUrl;
        this.sessionID = sessionID;
    }

    public KVStore() {

    }
}
