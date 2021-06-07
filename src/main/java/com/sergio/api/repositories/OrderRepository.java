package com.sergio.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergio.api.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
