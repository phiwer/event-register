package com.phiwer.eventregister.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

1    @Column(name = "first_name")
    private final String firstName;

    @NotNull
    @Column(name = "last_name")
    private final String lastName;

    @NotNull
    @Column(name = "email")
    private final String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    protected User() {
        firstName = "";
        lastName = "";
        email = "";
    }
}
