package com.fikadu.springbootrestfulmysqlapp.service;

import com.fikadu.springbootrestfulmysqlapp.entity.Product;
import com.fikadu.springbootrestfulmysqlapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product){
       return productRepository.save(product);
    }

    public Product getProduct(Integer id) {

        return productRepository.findById(id).orElse(null);
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
