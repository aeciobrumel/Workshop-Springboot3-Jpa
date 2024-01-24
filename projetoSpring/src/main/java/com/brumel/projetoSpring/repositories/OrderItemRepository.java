package com.brumel.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brumel.projetoSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
