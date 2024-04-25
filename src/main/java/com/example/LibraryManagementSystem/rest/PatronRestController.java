package com.example.LibraryManagementSystem.rest;

import com.example.LibraryManagementSystem.entity.Book;
import com.example.LibraryManagementSystem.entity.Patron;
import com.example.LibraryManagementSystem.service.BookService;
import com.example.LibraryManagementSystem.service.PatronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PatronRestController {
    private PatronService patronService;

    @Autowired
    public PatronRestController(PatronService patronService) {
        this.patronService = patronService;
    }

    @GetMapping("/patrons")
    public List<Patron> findAll() {
        return patronService.findAll();
    }
    @GetMapping("/patrons/{id}")
    public Patron findByID(@PathVariable int id){
        return patronService.findByID(id);
    }
}