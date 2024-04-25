package com.example.LibraryManagementSystem.dao;

import com.example.LibraryManagementSystem.entity.Book;
import com.example.LibraryManagementSystem.entity.Patron;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatronDAOJpaImpl implements PatronDAO{
    private EntityManager entityManager;
    @Autowired
    public PatronDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<Patron> findAll() {
        TypedQuery<Patron> patronTypedQuery=entityManager.createQuery("from Patron ",Patron.class);
        List<Patron> patrons=patronTypedQuery.getResultList();
        return patrons;
    }

    @Override
    public Patron findByID(int id) {
        return entityManager.find(Patron.class,id);
    }
}
