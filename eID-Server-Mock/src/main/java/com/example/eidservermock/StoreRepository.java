package com.example.eidservermock;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<KVStore, String> {
}