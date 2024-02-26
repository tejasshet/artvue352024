package com.example.artvue.ecommercearts.repository;
import com.example.artvue.ecommercearts.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    // Additional query methods can be added here if needed
    Admin findByUsername(String username);
}
