//package com.example.artvue.ecommercearts.model;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "product")
//public class products {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "product_id")
//    private Integer productId;
//
//    @Column(name = "product_name", nullable = false)
//    private String productName;
//
//    @Column(name = "product_description", nullable = false)
//    private String productDescription;
//
//    @Column(name = "price", nullable = false)
//    private double price;
//
//    @Column(name = "ratings", nullable = false)
//    private double ratings;
//
//    @Column(name = "number_of_ratings", nullable = false)
//    private Integer numberOfRatings;
//
//    // Constructors, getters, setters, and other methods
//
//    // Default constructor
//    public products() {
//    }
//
//    // Parameterized constructor
//    public products(String productName, String productDescription, double price, double ratings, Integer numberOfRatings) {
//        this.productName = productName;
//        this.productDescription = productDescription;
//        this.price = price;
//        this.ratings = ratings;
//        this.numberOfRatings = numberOfRatings;
//    }
//
//    // Getters and Setters for all attributes
//
//    public Integer getProductId() {
//        return productId;
//    }
//
//    public void setProductId(Integer productId) {
//        this.productId = productId;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public String getProductDescription() {
//        return productDescription;
//    }
//
//    public void setProductDescription(String productDescription) {
//        this.productDescription = productDescription;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public double getRatings() {
//        return ratings;
//    }
//
//    public void setRatings(double ratings) {
//        this.ratings = ratings;
//    }
//
//    public Integer getNumberOfRatings() {
//        return numberOfRatings;
//    }
//
//    public void setNumberOfRatings(Integer numberOfRatings) {
//        this.numberOfRatings = numberOfRatings;
//    }
//
//    // Additional methods as needed
//
//    // Override toString for better logging or debugging
//    @Override
//    public String toString() {
//        return "Product{" +
//                "productId=" + productId +
//                ", productName='" + productName + '\'' +
//                ", productDescription='" + productDescription + '\'' +
//                ", price=" + price +
//                ", ratings=" + ratings +
//                ", numberOfRatings=" + numberOfRatings +
//                '}';
//    }
//}
//
