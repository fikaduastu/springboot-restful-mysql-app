package com.fikadu.springbootrestfulmysqlapp.repository;

import com.fikadu.springbootrestfulmysqlapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
