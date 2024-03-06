package com.example.artvue.ecommercearts.service;

import com.example.artvue.ecommercearts.model.Customer;
import com.example.artvue.ecommercearts.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    //to add customer...
    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    //to retrieve all the customers....
    public List<Customer> getAllCustomerList(){
        return customerRepository.findAll();
    }

    public List<Customer> getAllCustomers() {
        return getAllCustomers();
    }

//    public List<Customer> getAllCustomers() {
//
//    }
}
