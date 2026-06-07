package com.hireflow.ats.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.*;

@Entity
@Table(name = "users")
@Getter@Setter
@Data
public class User {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;
}
