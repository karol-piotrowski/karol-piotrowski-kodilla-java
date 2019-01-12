package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.Date;

public class User {
    private String username;
    private String firstname;
    private String lastname;
    private LocalDate birthDate;
    private String address;

    public User(String username, String firstname, String lastname, LocalDate birthDate, String address) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }
}
