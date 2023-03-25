package org.example.seminar5.hw.service;

import org.example.seminar5.hw.model.Product;

import java.util.List;

public interface VendingMachine<T extends Product> {

    void initProduct(List<T> products);

    String getProduct(String name);
}
