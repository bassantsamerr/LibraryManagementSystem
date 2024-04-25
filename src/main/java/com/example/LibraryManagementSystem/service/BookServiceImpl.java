package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.dao.BookDAO;
import com.example.LibraryManagementSystem.entity.Book;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{
    private BookDAO bookDAO;
    @Autowired
    public BookServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }
    @Transactional
    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    @Override
    public Book findByID(int id) {
       return bookDAO.findByID(id);
    }

}
