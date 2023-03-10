package org.example.seminar1.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        List<Product> products = new ArrayList<>(Arrays.asList(new Product("pepsi", 42),
                new Product("chocolate", 67), new Product("cola", 70)));
        vendingMachine.initProduct(products);  // создаем список продуктов
//        System.out.println(vendingMachine.getProduct("cola"));  // ищем продукт
        vendingMachine.getProduct("cola"); // ищем продукт
    }
}
