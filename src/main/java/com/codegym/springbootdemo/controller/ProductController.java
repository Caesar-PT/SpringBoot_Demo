package com.codegym.springbootdemo.controller;

import com.codegym.springbootdemo.model.Product;
import com.codegym.springbootdemo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.OutputKeys;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/index")
    public ResponseEntity<List<Product>> showAll(){
      return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> delProduct(@PathVariable Long id){
        productService.delProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/index")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Product> editProduct(@PathVariable Long id, @RequestBody Product product){
       product.setId(id);
       productService.editProduct(product);
       return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("view/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        return new ResponseEntity<>(productService.findByID(id), HttpStatus.OK);
    }
}
