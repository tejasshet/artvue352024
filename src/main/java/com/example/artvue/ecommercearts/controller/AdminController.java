package com.example.artvue.ecommercearts.controller;

import com.example.artvue.ecommercearts.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admins")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticateAdmin(
            @RequestParam String username,
            @RequestParam String password) {
        boolean isAuthenticated = adminService.verifyAdminCredentials(username, password);

        if (isAuthenticated) {
            return new ResponseEntity<>("Admin authentication successful", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Admin authentication failed", HttpStatus.UNAUTHORIZED);
        }
    }
}
