package com.example.artvue.ecommercearts.repository;

import com.example.artvue.ecommercearts.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}