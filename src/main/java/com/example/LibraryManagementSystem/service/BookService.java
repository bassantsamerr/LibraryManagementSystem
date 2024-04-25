package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> findAll();
    public Book findByID(int id);
}
