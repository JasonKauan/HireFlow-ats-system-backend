package com.hireflow.ats.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(length = 4000)
    private String description;
}
