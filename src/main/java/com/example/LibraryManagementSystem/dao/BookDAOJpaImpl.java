package com.example.LibraryManagementSystem.dao;

import com.example.LibraryManagementSystem.entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BookDAOJpaImpl implements BookDAO{
    private EntityManager entityManager;
    @Autowired
    public BookDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<Book> findAll() {
        TypedQuery<Book> bookTypedQuery=entityManager.createQuery("from Book",Book.class);
        List<Book> books=bookTypedQuery.getResultList();
        return books;
    }

    @Override
    public Book findByID(int id) {
        return entityManager.find(Book.class,id);
    }

    @Override
    public Book add(Book book) {
        return book;
    }
}
