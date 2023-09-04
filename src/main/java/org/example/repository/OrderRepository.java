package org.example.repository;

import org.example.agregator.Order;

import java.util.List;

public interface OrderRepository {
    void save(Order order);
    Order loadById(int orderId);
    List<Order> loadAll();
}