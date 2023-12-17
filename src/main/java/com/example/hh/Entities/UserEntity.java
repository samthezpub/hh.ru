package com.example.hh.Entities;

import jakarta.persistence.*;
import lombok.Data;


import java.util.Collection;
import java.util.List;

@Data
@Entity
public class UserEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private RoleEntity role;

    // то по чему будем входить
    private String username;
    private String email;
    private String password;


    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city")
    private CityEntity city;

    @OneToMany
    private List<ResponseEntity> responses;


}
