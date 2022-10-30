package com.example.demo;

import javax.persistence.*;

@Table(name="product")
@Entity
public class Product{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "year")
    private String year;

    public Product(Integer id, String name, double price, String year) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public Product() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getYear() {
        return year;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
