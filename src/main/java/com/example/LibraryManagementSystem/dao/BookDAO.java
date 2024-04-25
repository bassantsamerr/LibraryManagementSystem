package com.example.LibraryManagementSystem.dao;

import com.example.LibraryManagementSystem.entity.Book;

import java.util.List;

public interface BookDAO {
    public List<Book> findAll();
    public Book findByID(int id);
    public Book add(Book book);
}
