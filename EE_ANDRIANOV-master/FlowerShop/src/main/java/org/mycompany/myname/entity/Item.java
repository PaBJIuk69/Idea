package org.mycompany.myname.entity;


import javax.persistence.*;

@Entity
public class Item  {

    private int id;

    @OneToMany
    private Flower flower;

    @OneToMany
    private Order order;

    private int number;



    public Item(int number, Flower flower) {
        this.number = number;
        this.flower = flower;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Flower getFlower() { return flower; }

    public void setFlower(Flower flower) { this.flower = flower; }

    public Order getOrder() { return order; }

    public void setOrder(Order order) { this.order = order; }
}
