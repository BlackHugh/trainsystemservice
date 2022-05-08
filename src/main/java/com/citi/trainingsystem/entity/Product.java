package com.citi.trainingsystem.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String name;
    private double price;


    @Override
    public String toString() {
        return "id: " + id.toString() + ", name: " + name  + "price: " + String.valueOf(price);
    }
}
