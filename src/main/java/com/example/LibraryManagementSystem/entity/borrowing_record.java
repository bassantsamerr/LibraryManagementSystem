package com.example.LibraryManagementSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "borrowing_record")
public class borrowing_record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int ID;
    @Column(name = "book_ID")
    private int book_ID;
    @Column(name = "patron_ID")
    private int patron_ID;
    @Column(name = "checkout_date")
    private String checkout_date;

    @Column(name = "return_date")
    private String return_date;


    public borrowing_record() {

    }

    public borrowing_record(int book_ID, int patron_ID, String checkout_date, String return_date) {
        this.book_ID = book_ID;
        this.patron_ID = patron_ID;
        this.checkout_date = checkout_date;
        this.return_date = return_date;
    }

    public int getBook_ID() {
        return book_ID;
    }

    public void setBook_ID(int book_ID) {
        this.book_ID = book_ID;
    }

    public int getPatron_ID() {
        return patron_ID;
    }

    public void setPatron_ID(int patron_ID) {
        this.patron_ID = patron_ID;
    }

    public String getCheckout_date() {
        return checkout_date;
    }

    public void setCheckout_date(String checkout_date) {
        this.checkout_date = checkout_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }
}