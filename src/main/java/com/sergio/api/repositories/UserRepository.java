package com.sergio.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergio.api.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
