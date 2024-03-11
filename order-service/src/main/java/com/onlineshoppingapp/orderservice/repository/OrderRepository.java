package com.onlineshoppingapp.orderservice.repository;

import com.onlineshoppingapp.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
