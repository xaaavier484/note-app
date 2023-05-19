package com.example.notespro;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

public abstract class FirestoreRecyclerAdapter<T, T1> {
    protected abstract void onBindViewHolder(@NonNull NoteAdapter.NoteViewHolder holder, int position, @NonNull Note note);

    @NonNull
    public abstract NoteAdapter.NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType);
}
