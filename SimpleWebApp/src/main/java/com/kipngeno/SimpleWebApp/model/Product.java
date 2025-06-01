package com.kipngeno.SimpleWebApp.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Product {

    private int productId;
    private String productName;
    private double price;

    public Product(int productId,String productName,double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                '}';
    }

    public Product() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
