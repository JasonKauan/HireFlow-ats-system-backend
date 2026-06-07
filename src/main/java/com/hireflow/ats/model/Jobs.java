package com.hireflow.ats.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "jobs")
@Data
@Getter@Setter
public class Jobs {

    @Column(nullable = false)
    @Id
    private long id;


    @Column(nullable = false)
    private String title;


    @Column(length = 4000)
    private String description;


    @Column(nullable = false)
    private BigDecimal salary;

    @Column(nullable = false)
    private String status;
}
