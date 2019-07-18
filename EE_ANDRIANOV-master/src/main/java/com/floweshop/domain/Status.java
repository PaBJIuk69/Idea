package com.floweshop.domain;

public class Status {
    private String paid;
    private String expecting_delivery;
    private String delivered;

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getExpecting_delivery() {
        return expecting_delivery;
    }

    public void setExpecting_delivery(String expecting_delivery) {
        this.expecting_delivery = expecting_delivery;
    }

    public String getDelivered() {
        return delivered;
    }

    public void setDelivered(String delivered) {
        this.delivered = delivered;
    }
}
