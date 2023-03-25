package org.example.seminar5.hw.service;

import org.example.seminar5.hw.model.HotDrinks;
import org.example.seminar5.hw.model.Product;


import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrinks<T extends Product> implements VendingMachine {
    List<HotDrinks> hotDrinksList= new ArrayList<>();

//    public VendingMachineHotDrinks(List<HotDrinks> hotDrinksList) {
//        this.hotDrinksList = hotDrinksList;
//    }

        public VendingMachineHotDrinks() {
        super();
    }

//    void initProduct(List<HotDrinks> hotDrinks) {
//        this.hotDrinksList = hotDrinks;
//    }

    @Override
    public void initProduct(List hotDrinks) {
        this.hotDrinksList = hotDrinks;
    }

    @Override
    public String getProduct(String name) {        // метод для вывода горячих напитков с названием name (переопределяем родительский)
        for (HotDrinks hd : hotDrinksList) {
            if (hd.getName().contains(name)) return hd.getName() + ", " + hd.getPrice();
        }
        return new HotDrinks("Нет горячих напитков", 0, 0).toString();
    }

    //    @Override
    public String getProduct(String name, int price, int temperature) {
        List<HotDrinks> result= new ArrayList<>();
        for (HotDrinks hd: hotDrinksList) {
            if (hd.getName().equals(name) && hd.getPrice() <= price && hd.getTemperature() == temperature) {
                result.add(hd);
            }
        }
        return result.toString();
    }
}
