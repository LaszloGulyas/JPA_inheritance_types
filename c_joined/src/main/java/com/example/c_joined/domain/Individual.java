package com.example.c_joined.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "individual")
public class Individual extends Client {

    //child class can not have ID (parent's ID will be used)

    @Column(name = "name", columnDefinition = "varchar(20)")
    private String name;

    @Column(name = "surname", columnDefinition = "varchar(20)")
    private String surname;

    public Individual() {
    }

    //super constructor has to be called to fill the common columns
    public Individual(String address, Character type, String name, String surname) {
        super(address, type);
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
