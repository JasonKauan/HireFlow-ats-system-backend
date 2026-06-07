package com.hireflow.ats.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "audit_logs")
@Getter@Setter
public class AuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String action;


    @Column(nullable = false)
    private String createdAt;

}
