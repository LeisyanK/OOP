package org.example.seminar5.hw.service;

import org.example.seminar5.hw.model.BottleOfWater;
import org.example.seminar5.hw.model.Product;
import org.example.seminar5.hw.service.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottles<T extends Product> implements VendingMachine {
    List<BottleOfWater> bottleOfWaters = new ArrayList<>();

    public VendingMachineBottles() {
        super();
    }

    @Override
//    void initProduct(List<BottleOfWater> bottle) {
    public void initProduct(List bottle) {
//        this.products.add(products);
        this.bottleOfWaters = bottle;
    }



    @Override
    public String getProduct(String name) {
        for (BottleOfWater p : bottleOfWaters) {
            if (p.getName().contains(name)) return p.getName() + ", " + p.getPrice(); // return p.toString();
        }
        return new BottleOfWater("Нет бутылок воды", 0).toString();
    }

//    @Override
    public String getProduct(String name, int maxPrice) {
        List<BottleOfWater> bottleOfWaters1 = new ArrayList<>();
        for (BottleOfWater p : bottleOfWaters) {
            if (p.getName().contains(name) && p.getPrice() <= maxPrice) //return p.getName() + ", " + p.getPrice(); // return p.toString();
                bottleOfWaters1.add(p);
        }
        return bottleOfWaters1.toString(); //new BottleOfWater("Нет бутылок воды", 0).toString();
    }
}
