package com.codegym.springbootdemo.service;

import com.codegym.springbootdemo.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {
    List<Product> findAll();

    Product findByID(long id);

    Product addProduct(Product product);

    void delProduct(long id);

    void editProduct(Product product);
}
