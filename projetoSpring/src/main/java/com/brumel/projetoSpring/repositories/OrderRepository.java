package com.brumel.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brumel.projetoSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
