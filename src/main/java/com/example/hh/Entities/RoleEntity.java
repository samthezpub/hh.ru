package com.example.hh.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class RoleEntity {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @OneToMany
    private List<UserEntity> users;
}
