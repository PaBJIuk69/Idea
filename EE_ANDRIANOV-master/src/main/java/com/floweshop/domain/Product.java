package com.floweshop.domain;

import com.floweshop.repos.SkladModification;

public class Product implements SkladModification {

    private int id;
    private String name;
    private int number;
    private int price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void addProduct() {
        System.out.println("Товар добавлен");
    }

    public void reverseProduct() {
        System.out.println("Товар изменен");
    }

    public void removeProduct() {
        System.out.println("Товар удален");
    }
}
