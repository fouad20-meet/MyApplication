package com.example.myapplication;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String email;
    private String password;
    private int id;
    private boolean aredetailssaved;
    public Person(String name, String email, String password, int id, boolean aredetailssaved){
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = id;
        this.aredetailssaved = aredetailssaved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAredetailssaved() {
        return aredetailssaved;
    }

    public void setAredetailssaved(boolean aredetailssaved) {
        this.aredetailssaved = aredetailssaved;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", id='" + id + '\'' +
                ", aredetailssaved=" + aredetailssaved +
                '}';
    }
}
