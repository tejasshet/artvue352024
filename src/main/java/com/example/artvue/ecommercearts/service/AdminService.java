package com.example.artvue.ecommercearts.service;

import com.example.artvue.ecommercearts.model.Admin;
import com.example.artvue.ecommercearts.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminService {

    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    // Service method to verify username and password
    public boolean verifyAdminCredentials(String username, String password) {
        Admin admin = adminRepository.findByUsername(username);

        // Check if admin is found and password matches
        return admin != null && admin.getPassword().equals(password);
    }
}
