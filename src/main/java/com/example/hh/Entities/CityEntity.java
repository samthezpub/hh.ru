package com.example.hh.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    private List<UserEntity> users;
}
