package org.example.seminar5.hw;

import org.example.seminar5.hw.model.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class VendingMachine <T extends Product>{
    private String name; // название автомата
    List<T> vm;

//    public VendingMachine(String name) {
//        this.name = name;
//    }
    public VendingMachine(String name) {
        this.name = name;
        this.vm = new ArrayList<>();
    }
//    public VendingMachine(String name, List<T> vm) {
//        this.name = name;
//        this.vm = vm;
//    }

    abstract void initProduct(List<T> products);
    abstract String getProduct(String name);

}
