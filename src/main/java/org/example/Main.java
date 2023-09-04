package org.example;

import com.google.common.collect.ImmutableList;
import org.example.agregator.Order;
import org.example.repository.OrderRepositoryImpl;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<org.example.agregator.Order> orders = new OrderRepositoryImpl().loadAll();
        }
}