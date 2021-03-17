package com.codegym.springbootdemo.service;

import com.codegym.springbootdemo.model.Product;
import com.codegym.springbootdemo.repository.ProductServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private ProductServiceRepo productServiceRepo;

    @Override
    public List<Product> findAll() {
        return productServiceRepo.findAll();
    }

    @Override
    public Product findByID(long id) {
        return productServiceRepo.findById(id).get();
    }

    @Override
    public Product addProduct(Product product) {
        return productServiceRepo.save(product);
    }

    @Override
    public void delProduct(long id) {
        productServiceRepo.deleteById(id);
    }

    @Override
    public void editProduct(Product product) {
        productServiceRepo.save(product);
    }
}
