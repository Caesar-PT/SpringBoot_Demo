package com.codegym.springbootdemo.repository;

import com.codegym.springbootdemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductServiceRepo extends JpaRepository<Product,Long> {

}
