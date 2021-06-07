package com.sergio.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergio.api.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
