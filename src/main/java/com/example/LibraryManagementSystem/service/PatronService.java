package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.entity.Book;
import com.example.LibraryManagementSystem.entity.Patron;

import java.util.List;

public interface PatronService {
    public List<Patron> findAll();
    public Patron findByID(int id);
}
