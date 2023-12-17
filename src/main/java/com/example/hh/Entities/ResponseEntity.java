package com.example.hh.Entities;

import jakarta.persistence.*;

@Entity
public class ResponseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CompanyEntity company;
}
