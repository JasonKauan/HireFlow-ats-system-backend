package com.hireflow.ats.model;

import com.hireflow.ats.enums.JobStatus;
import jakarta.persistence.*;
import lombok.*;
import com.hireflow.ats.model.Company.*;

import java.math.BigDecimal;

@Entity
@Table(name = "jobs")
@Data
public class Jobs {

    @Column(nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;


    @Column(length = 4000)
    private String description;


    @Column(nullable = false)
    private BigDecimal salary;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @Column(nullable = false)
    private JobStatus status;
}
