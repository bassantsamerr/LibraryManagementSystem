package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.dao.BookDAO;
import com.example.LibraryManagementSystem.dao.PatronDAO;
import com.example.LibraryManagementSystem.entity.Book;
import com.example.LibraryManagementSystem.entity.Patron;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatronServiceImpl implements PatronService {
    private PatronDAO patronDAO;
    @Autowired
    public PatronServiceImpl(PatronDAO patronDAO) {
        this.patronDAO = patronDAO;
    }
    @Transactional
    @Override
    public List<Patron> findAll() {
        return patronDAO.findAll();
    }

    @Override
    public Patron findByID(int id) {
        return patronDAO.findByID(id);
    }
}
