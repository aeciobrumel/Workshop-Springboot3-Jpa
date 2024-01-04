package com.brumel.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brumel.projetoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
