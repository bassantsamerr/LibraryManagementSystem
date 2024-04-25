package com.example.LibraryManagementSystem.dao;

import com.example.LibraryManagementSystem.entity.Book;
import com.example.LibraryManagementSystem.entity.Patron;

import java.util.List;

public interface PatronDAO {
    public List<Patron> findAll();
    public Patron findByID(int id);
}
