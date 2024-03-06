package com.example.artvue.ecommercearts.repository;

import com.example.artvue.ecommercearts.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
