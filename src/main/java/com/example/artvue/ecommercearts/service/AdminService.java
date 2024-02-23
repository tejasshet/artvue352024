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

    // Service method to verify admin credentials
    public boolean verifyAdminCredentials(String username, String password) {
        Admin admin = adminRepository.findByUsername(username);

        // Log received credentials for debugging
        System.out.println("Received username: " + username);
        System.out.println("Received password: " + password);

        // Check if admin is found and password matches
        boolean isValidCredentials = admin != null && admin.getPassword().equals(password);

        // Log verification result for debugging
        System.out.println("Credentials verification result: " + isValidCredentials);

        return isValidCredentials;
    }
}
