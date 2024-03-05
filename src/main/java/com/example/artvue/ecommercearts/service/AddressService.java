package com.example.artvue.ecommercearts.service;
import com.example.artvue.ecommercearts.model.Address;
import com.example.artvue.ecommercearts.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address updateAddress(int addressID, Address address) {
        Optional<Address> addressOptional = addressRepository.findById(addressID);
        if (!addressOptional.isPresent()) {
            throw new RuntimeException("Address not found with id: " + addressID);
        }
        address.setAddressID(addressID);
        return addressRepository.save(address);
    }

    public void deleteAddress(int addressID) {
        Optional<Address> addressOptional = addressRepository.findById(addressID);
        if (!addressOptional.isPresent()) {
            throw new RuntimeException("Address not found with id: " + addressID);
        }
        addressRepository.deleteById(addressID);
    }


}