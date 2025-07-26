package com.store.products.model;

import jakarta.persistence.*;


@Table(name="product")
@Entity
public class Product {

    @Id
    private long id;
    private String name;
    @Lob
    private byte[] image;
    private Double inventoryQuantity;
    private double rate;
    private String size;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Double getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(Double inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
