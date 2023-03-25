package org.example.seminar5.hw.service;

import org.example.seminar5.hw.model.BottleOfWater;
import org.example.seminar5.hw.model.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottles<T extends Product> implements VendingMachine {
    List<BottleOfWater> bottleOfWaters = new ArrayList<>();

    public VendingMachineBottles() {
        super();
    }

    @Override
    public void initProduct(List bottle) {
        this.bottleOfWaters = bottle;
    }

    @Override
    public String getProduct(String name) {
        for (BottleOfWater p : bottleOfWaters) {
            if (p.getName().contains(name)) return p.getName() + ", " + p.getPrice();
        }
        return new BottleOfWater("Нет бутылок воды", 0).toString();
    }

    public String getProduct(String name, int maxPrice) {
        List<BottleOfWater> bottleOfWaters1 = new ArrayList<>();
        for (BottleOfWater p : bottleOfWaters) {
            if (p.getName().contains(name) && p.getPrice() <= maxPrice)
                bottleOfWaters1.add(p);
        }
        return bottleOfWaters1.toString();
    }
}
