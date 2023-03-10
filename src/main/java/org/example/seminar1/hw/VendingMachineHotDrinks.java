package org.example.seminar1.hw;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrinks extends VendingMachine{
    List<HotDrinks> hotDrinksList= new ArrayList<>();

    void initProduct(List<HotDrinks> hotDrinks) {
        this.hotDrinksList = hotDrinks;
    }

    @Override
    String getProduct(String name) {
        for (HotDrinks hd : hotDrinksList) {
            if (hd.getName().contains(name)) return hd.getName() + ", " + hd.getPrice();
        }
        return new HotDrinks("Нет горячих напитков", 0, 0).toString();
    }

    //    @Override
    String getProduct(String name, int price, int temperature) {
        List<HotDrinks> result= new ArrayList<>();
        for (HotDrinks hd: hotDrinksList) {
            if (hd.getName().equals(name) && hd.getPrice() <= price && hd.getTemperature() == temperature) {
                result.add(hd);
            }
        }
        return result.toString();
    }
}
