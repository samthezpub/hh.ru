package com.example.hh.Services;

import com.example.hh.Entities.RoleEntity;
import com.example.hh.Exceptions.RoleNotFoundException;

public interface RoleService {
    RoleEntity findRoleByName(String name) throws RoleNotFoundException;
}
