package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.io.LineNumberReader;

import adapters.BookAdapter;
import models.Book;

public class BooksActivity extends AppCompatActivity implements IActivity{
    private RecyclerView bookRecyclerView;
    private RecyclerView.Adapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        setupUI();
        setupActions();
    }

    @Override
    public void setupUI() {
        bookRecyclerView = findViewById(R.id.bookRecyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                getApplicationContext(),
                RecyclerView.VERTICAL,false);

        bookRecyclerView.setLayoutManager(layoutManager);

        BookAdapter bookAdapter = new BookAdapter(this, Book.generateFakeBook());

        bookRecyclerView.setAdapter(bookAdapter);
    }

    @Override
    public void setupActions() {

    }
}