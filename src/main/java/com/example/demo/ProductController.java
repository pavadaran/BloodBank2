package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("products")
    public void add(@RequestBody Product product){
        productService.save(product);
    }

    @GetMapping("products")
    public List<Product> getAllProducts(){
        return productService.getAll();
    }

    @GetMapping("products/{id}")
    public Product getProduct(@PathVariable Integer id){
        return productService.getProduct(id);
    }

    @DeleteMapping("products/{id}")
    public void deleteProduct(@PathVariable Integer id){
        productService.delete(id);
    }
}
