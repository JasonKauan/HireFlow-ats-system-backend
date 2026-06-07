package com.hireflow.ats.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "resumes")
@Getter@Setter
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fileName;


    @Column(nullable = false)
    private String path;
}
