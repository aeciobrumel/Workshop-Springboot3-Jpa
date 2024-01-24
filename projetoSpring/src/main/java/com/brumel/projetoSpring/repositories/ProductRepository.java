package com.brumel.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brumel.projetoSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
