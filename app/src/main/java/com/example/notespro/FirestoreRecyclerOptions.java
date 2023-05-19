package com.example.notespro;

import com.google.firebase.firestore.Query;

import java.security.cert.CertPathBuilder;

public class FirestoreRecyclerOptions<T> {
    public static class Builder<T> {
        public CertPathBuilder setQuery(Query query, Class<Note> noteClass) {
            return null;
        }
    }
}
