package com.kipngeno.SimpleWebApp.service;

import com.kipngeno.SimpleWebApp.model.Product;
import com.kipngeno.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"Iphone",50000),
//            new Product(102,"Canon",70000),
//            new Product(103,"Xiaomi Redmi",20000)));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int productId) {
        return repo.findById(productId).orElse(new Product());
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(int productId) {
        repo.deleteById(productId);
    }
}
