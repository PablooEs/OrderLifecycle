package com.pablo.order.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long orderNumber;
    private Client client;
    private List<Product> products;
    private BigDecimal total;
    private Address shippingAddress;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }
}
