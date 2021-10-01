package com.fikadu.springbootrestfulmysqlapp.controller;

import com.fikadu.springbootrestfulmysqlapp.entity.Product;
import com.fikadu.springbootrestfulmysqlapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

   @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/getProduct/{id}")
    public Product getProduct(@PathVariable Integer id ){
       return productService.getProduct(id);
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(){
       return productService.getProducts();
    }
}
