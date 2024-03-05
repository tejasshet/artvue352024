package com.example.artvue.ecommercearts.controller;

import com.example.artvue.ecommercearts.model.Address;
import com.example.artvue.ecommercearts.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @PostMapping("/add")
    public Address addAddress(@RequestBody Address address) {
        return addressService.addAddress(address);
    }

    @PutMapping("/{addressID}")
    public Address updateAddress(@PathVariable int addressID, @RequestBody Address address) {
        return addressService.updateAddress(addressID, address);
    }

    @DeleteMapping("/{addressID}")
    public void deleteAddress(@PathVariable int addressID) {
        addressService.deleteAddress(addressID);
    }
}


