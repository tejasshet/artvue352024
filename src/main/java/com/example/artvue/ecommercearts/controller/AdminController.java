package com.example.artvue.ecommercearts.controller;
import com.example.artvue.ecommercearts.model.Admin;
import com.example.artvue.ecommercearts.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admins")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/auth")
    public ResponseEntity<String> loginAdmin(@RequestBody Admin admin) {
        boolean isAuthenticated = adminService.verifyAdminCredentials(admin.getUsername(), admin.getPassword());

        if (isAuthenticated) {
            return new ResponseEntity<>("Admin login successful", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Admin login failed", HttpStatus.UNAUTHORIZED);
        }
    }
}
