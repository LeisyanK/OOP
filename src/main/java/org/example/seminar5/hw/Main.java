package org.example.seminar5.hw;

import org.example.seminar5.hw.model.BottleOfWater;
import org.example.seminar5.hw.model.HotDrinks;
import org.example.seminar5.hw.service.VendingMachineBottles;
import org.example.seminar5.hw.service.VendingMachineHotDrinks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды), сделать
 * интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговогоАвтомата (пример:
 * ПродающийБутылкиВодыАвтомат
 */

public class Main {
    public static void main(String[] args) {
        VendingMachineBottles<BottleOfWater> vendingMachine1 = new VendingMachineBottles<>();
        List<BottleOfWater> bw = new ArrayList<>(Arrays.asList(new BottleOfWater("pepsi", 42),
                new BottleOfWater("sprite", 40), new BottleOfWater("sprite", 100),
                new BottleOfWater("cola", 70)));
        vendingMachine1.initProduct(bw);
        System.out.println(vendingMachine1.getProduct("sprite", 50).toString());

        VendingMachineHotDrinks<HotDrinks> hd = new VendingMachineHotDrinks<>();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(new HotDrinks("chocolate", 50, 65),
                new HotDrinks("coffee", 75, 65), new HotDrinks("hot coffee", 100, 95),
                new HotDrinks("tea", 45, 70)));
        hd.initProduct(hotDrinksList);
        System.out.println(hd.getProduct("coffee", 100, 65).toString());
    }
}
