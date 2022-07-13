package com.dpworld.flyway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpworld.flyway.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long>  {
     
}