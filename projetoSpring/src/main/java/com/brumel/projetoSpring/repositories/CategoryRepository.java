package com.brumel.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brumel.projetoSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
