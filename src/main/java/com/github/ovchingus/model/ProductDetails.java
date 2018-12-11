package com.github.ovchingus.model;

import javax.persistence.*;

@Entity
@Table(name = "ProductDetails")
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Color")
    private String color;

    @Column(name = "Description")
    private String description;

    public ProductDetails() {
    }

    public ProductDetails(String color, String description) {
        this.color = color;
        this.description = description;
    }

    public ProductDetails(int id, String color, String description) {
        this.id = id;
        this.color = color;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
