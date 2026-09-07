package com.hireflow.ats.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "recruiters")
public class Recruiter extends User {

    @Column
    private Long phoneNumber;


    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

}
