package org.example.seminar1.hw;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine1 extends VendingMachine {
    List<BottleOfWater> bottleOfWaters = new ArrayList<>();

    void initProduct(List<BottleOfWater> bottle) {
//        this.products.add(products);
        this.bottleOfWaters = bottle;
    }


    @Override
    String getProduct(String name) {
        for (BottleOfWater p : bottleOfWaters) {
            if (p.getName().contains(name)) return p.getName() + ", " + p.getPrice(); // return p.toString();
        }
        return new BottleOfWater("Нет бутылок воды", 0).toString();
    }

//    @Override
    String getProduct(String name, int maxPrice) {
        List<BottleOfWater> bottleOfWaters1 = new ArrayList<>();
        for (BottleOfWater p : bottleOfWaters) {
            if (p.getName().contains(name) && p.getPrice() <= maxPrice) //return p.getName() + ", " + p.getPrice(); // return p.toString();
                bottleOfWaters1.add(p);
        }
        return bottleOfWaters1.toString(); //new BottleOfWater("Нет бутылок воды", 0).toString();
    }
}
