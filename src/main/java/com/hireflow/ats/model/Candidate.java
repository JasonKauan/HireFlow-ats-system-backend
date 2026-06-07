package com.hireflow.ats.model;



import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter@Setter
@Table(name = "candidates")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(length = 2000)
    private String linkedinProfile;

    @Column(length = 2000)
    private String githubProfile;
}
