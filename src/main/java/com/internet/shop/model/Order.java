package com.internet.shop.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Order {
    private Long id;
    private List<Product> products;
    private Long userId;
    private LocalDateTime orderTime;

    public Order(List<Product> products, Long userId) {
        this.products = products;
        this.userId = userId;
        this.orderTime = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(products, order.products) &&
                Objects.equals(userId, order.userId) &&
                Objects.equals(orderTime, order.orderTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products, userId, orderTime);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + products +
                ", userId=" + userId +
                ", orderTime=" + orderTime +
                '}';
    }
}
