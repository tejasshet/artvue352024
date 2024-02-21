package com.example.artvue.ecommercearts.service;

import com.example.artvue.ecommercearts.model.products;
import com.example.artvue.ecommercearts.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class  ProductService {
    @Autowired
    private ProductRepository productRepository;
    public products saveProduct(products product) {  //to save products...
        return productRepository.save(product);
    }
    public void deleteProduct(int productId) {  //to delete products.......
        productRepository.deleteById(productId);
    }

    @Transactional
     public void updateProductRating(int productId, double newRating) {
        productRepository.updateProductRating(productId, newRating);
    }

}
