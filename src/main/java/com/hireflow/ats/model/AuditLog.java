package com.hireflow.ats.model;


import com.hireflow.ats.enums.ApplicationStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "audit_logs")
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User responsibleUser;


    @Column(nullable = false)
    private ApplicationStatus previousStep;


    @Column(nullable = false)
    private ApplicationStatus nextStep;



    @Column(nullable = false)
    private LocalDateTime createdAt;

}
