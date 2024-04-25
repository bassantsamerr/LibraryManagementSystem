package com.example.LibraryManagementSystem.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Patron")
public class Patron {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int ID;
    @Column(name = "name")
    private String name;
    @Column(name = "contact_information")
    private String contact_information;


    public Patron() {

    }

    public Patron(String name, String contact_information) {
        this.name = name;
        this.contact_information = contact_information;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact_information() {
        return contact_information;
    }

    public void setContact_information(String contact_information) {
        this.contact_information = contact_information;
    }
}
