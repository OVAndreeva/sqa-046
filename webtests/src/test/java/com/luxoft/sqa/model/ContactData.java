package com.luxoft.sqa.model;

public class ContactData {
    String firstname;
    String lastname;
    String address;
    String home;

    public ContactData(String firstname, String lastname, String address, String home) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.home = home;
    }

    public String getFirstname() {

        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() {
        return home;
    }
}
