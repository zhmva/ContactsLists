package com.example.contactslists;

public class ContactModel {

    private String name, number;

    public ContactModel() {

    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ContactModel(String name, String number) {
        this.name = name;
        this.number = number;



    }
}
