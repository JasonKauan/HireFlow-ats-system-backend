package com.hireflow.ats.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@Table(name = "applications")
@Entity
public class Aplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "candidate_id", nullable = false)
    private Candidate candidate;


    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private Jobs job;



    @Column(nullable = false)
    private String status;
}
