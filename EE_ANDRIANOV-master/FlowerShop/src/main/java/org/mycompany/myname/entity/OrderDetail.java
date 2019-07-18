package org.mycompany.myname.entity;

import javax.persistence.*;


@Entity
@Table(name = "orderdetail")
public class OrderDetail  {
    @Id
    @Column(name = "orderId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToMany
    private int orderId;

    @Column(name = "flowerId")
    private int flowerId;

    @Column(name = "price")
    private  int price;

    @Column(name = "number")
    private int number;


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(int flowerId) {
        this.flowerId = flowerId;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}
