//package com.example.artvue.ecommercearts.repository;
//
//import com.example.artvue.ecommercearts.model.products;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.transaction.annotation.Transactional;
//
//public interface ProductRepository extends JpaRepository<products,Integer> {
//    @Transactional
//    @Modifying
//    @Query("UPDATE products p SET p.ratings = :newRating WHERE p.productId = :productId")
//    void updateProductRating(int productId, double newRating);
//}
