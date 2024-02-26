package com.example.artvue.ecommercearts.controller;

import com.example.artvue.ecommercearts.model.Admin;
import com.example.artvue.ecommercearts.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginAdmin(@RequestBody Admin admin) {
        boolean isAuthenticated = adminService.verifyAdminCredentials(admin.getUsername(), admin.getPassword());

        if (isAuthenticated) {
            // Additional logic when credentials are correct
            String additionalInfo = "Welcome, " + admin.getUsername() + "!";
            return new ResponseEntity<>(additionalInfo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Admin login failed", HttpStatus.UNAUTHORIZED);
        }
    }
}
