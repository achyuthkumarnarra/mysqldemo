package com.mysql.demo;


import jakarta.persistence.*;

@Entity
@Table
public class visitors {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,name="vname")
    private String name;
    @Id @Column
    private String phonenumber;

    public visitors(){

    }

    public visitors(int id, String name, String phonenumber) {
        this.id = id;
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
