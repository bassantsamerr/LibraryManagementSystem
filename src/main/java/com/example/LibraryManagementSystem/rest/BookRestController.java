package com.example.LibraryManagementSystem.rest;

import com.example.LibraryManagementSystem.entity.Book;
import com.example.LibraryManagementSystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookRestController {
    private BookService bookService;
    @Autowired
    public BookRestController(BookService bookService){
        this.bookService=bookService;
    }
    @GetMapping("/books")
    public List<Book>  findAll(){
       return bookService.findAll();
    }
    @GetMapping("/books/{id}")
    public Book findByID(@PathVariable int id){
        return bookService.findByID(id);
    }
}
