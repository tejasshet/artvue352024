package com.example.artvue.ecommercearts.service;

import com.example.artvue.ecommercearts.model.Orders;
import com.example.artvue.ecommercearts.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    //add orders.....
    public Orders addOrder(Orders order) {
        return orderRepository.save(order);
    }


    //    public boolean deleteOrder(String orderId) {
//        // Check if the order exists
//        Optional<Orders> optionalOrder = orderRepository.findById(Integer.valueOf(orderId));
//        if (optionalOrder.isPresent()) {
//            // Order exists, delete it
//            orderRepository.deleteById(Integer.valueOf(orderId));
//            return true;
//        } else {
//            // Order not found
//            return false;
//        }
//    }
    //To list all the orders returns null for now......
    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }
}
