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


    @OneToOne
    @JoinColumn(name = "candidate_id", nullable = false)
    private Candidate candidate;

    @Column(nullable = false)
    private String fileName;


    @Column(nullable = false)
    private String path;
}
