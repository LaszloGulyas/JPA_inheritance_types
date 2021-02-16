package com.example.b_table_per_class.domain;

import javax.persistence.*;

@Entity
//this defines the way of implementing inheritance on database side
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "client")
public class Client {

    @Id
    // !!! Identity generationType is not allowed here, because it could generate duplicated IDs for different tables
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "address", columnDefinition = "varchar(50)")
    private String address;

    @Column(name = "type", columnDefinition = "char(1)")
    private Character type;


    public Client() {
    }

    public Client(String address, Character type) {
        this.address = address;
        this.type = type;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }
}
