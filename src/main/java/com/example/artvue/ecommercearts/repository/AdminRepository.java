package com.example.artvue.ecommercearts.repository;

import com.example.artvue.ecommercearts.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {

    Admin findByUsername(String username);
}
