package com.demo.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.userservice.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}