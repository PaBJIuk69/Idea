package com.floweshop.domain;

public class Sklad extends Product {

    private Product flower;

    public Sklad() {
    }

    public Product getFlower() {
        return flower;
    }

    public void setFlower(Product flower) {
        this.flower = flower;
    }

}

