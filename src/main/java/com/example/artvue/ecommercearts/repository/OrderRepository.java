package com.example.artvue.ecommercearts.repository;

import com.example.artvue.ecommercearts.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
