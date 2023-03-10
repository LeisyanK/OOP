package org.example.seminar1.task1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();

    public void initProduct(List<Product> products) {
        this.products = products;
    } // используется как Setter

    public Product getProduct(String name) { // используется как Getter
        for (Product p: products) {
            if (p.getName().equals(name)) //return p;
                System.out.println(p);
        }
        return new Product("Продукт не найден", 0);
    }

}
