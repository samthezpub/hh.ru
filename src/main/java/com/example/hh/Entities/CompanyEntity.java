package com.example.hh.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @OneToMany
    private List<ResponseEntity> responses;

    @OneToMany
    private List<VacancyEntity> vacancies;



}
