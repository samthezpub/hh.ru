package com.example.hh.Repository;

import com.example.hh.Entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {

    @Query("SELECT r FROM RoleEntity r WHERE r.name = :name")
    public Optional<RoleEntity> findRoleEntityByName(@Param("name") String name);

}
