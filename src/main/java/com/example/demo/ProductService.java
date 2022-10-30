package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void save(Product product){
        productRepository.save(product);
    }

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public void delete(Integer id){
        productRepository.deleteById(id);
    }

    public Product getProduct(Integer id){
        return productRepository.findById(id).get();
    }

}
