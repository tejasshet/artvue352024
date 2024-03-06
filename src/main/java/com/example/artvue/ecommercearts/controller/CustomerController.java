package com.example.artvue.ecommercearts.controller;

import com.example.artvue.ecommercearts.model.Customer;
import com.example.artvue.ecommercearts.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

     @PostMapping("/add")
     public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
         return new ResponseEntity<>(customerService.addCustomer(customer), HttpStatus.CREATED);
     }

     @GetMapping("/all")
     public ResponseEntity<List<Customer>> getAllCustomers() {
         return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.OK);
     }

}
