package com.hireflow.ats.model;



import jakarta.persistence.*;


@Table(name = "roles")
public class Role {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(nullable = false, unique = true)
    private String name;

}
