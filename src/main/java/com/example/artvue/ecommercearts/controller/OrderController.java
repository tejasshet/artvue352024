package com.example.artvue.ecommercearts.controller;

import com.example.artvue.ecommercearts.model.Orders;
import com.example.artvue.ecommercearts.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    public ResponseEntity<Orders> addOrder(@RequestBody Orders order) {
        return new ResponseEntity<>(orderService.addOrder(order), HttpStatus.CREATED);
    }

//    @DeleteMapping("/delete/{orderId}")
//    public ResponseEntity<String> deleteOrder(@PathVariable String orderId) {
//        boolean deleted = orderService.deleteOrder(orderId);
//        if (deleted) {
//            return new ResponseEntity<>("Order deleted successfully", HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>("Order not found or unable to delete", HttpStatus.NOT_FOUND);
//        }
//    }

    @GetMapping("/list")
    public ResponseEntity<List<Orders>> getAllOrders() {
        List<Orders> orders = orderService.getAllOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
}
