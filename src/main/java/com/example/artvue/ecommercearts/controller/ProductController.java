//package com.example.artvue.ecommercearts.controller;
//
//import com.example.artvue.ecommercearts.model.products;
//import com.example.artvue.ecommercearts.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/products")
//public class ProductController {
//    @Autowired
//    private ProductService productService;
//    @PostMapping
//    public ResponseEntity<products> saveProduct(@RequestBody products product) {
//        products savedProduct = productService.saveProduct(product);
//
//        if (savedProduct != null) {
//            return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
//        } else {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//    @DeleteMapping("/{productId}")
//    public ResponseEntity<Void> deleteProduct(@PathVariable int productId) {
//        productService.deleteProduct(productId);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//    @PatchMapping("/{productId}/rating")
//    public ResponseEntity<Void> updateProductRating(
//            @PathVariable int productId,
//            @RequestParam double newRating) {
//
//        productService.updateProductRating(productId, newRating);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//}
