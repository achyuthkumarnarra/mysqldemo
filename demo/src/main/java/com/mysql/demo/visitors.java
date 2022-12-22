package com.mysql.demo;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import jakarta.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class visitors {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column (name="name")
    private String name;
    @Id @Column (name="phonenumber")
    private String phonenumber;

}
