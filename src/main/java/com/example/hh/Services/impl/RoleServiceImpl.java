package com.example.hh.Services.impl;

import com.example.hh.Entities.RoleEntity;
import com.example.hh.Exceptions.RoleNotFoundException;
import com.example.hh.Repository.RoleRepository;
import com.example.hh.Services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public RoleEntity findRoleByName(String name) throws RoleNotFoundException {
        return roleRepository.findRoleEntityByName(name).orElseThrow(()-> new RoleNotFoundException("Роль не найдена"));
    }
}
