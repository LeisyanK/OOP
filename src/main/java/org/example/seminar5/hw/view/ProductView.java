package org.example.seminar5.hw.view;

import org.example.seminar5.hw.model.BottleOfWater;
import org.example.seminar5.hw.model.HotDrinks;
import org.example.seminar5.hw.service.VendingMachineBottles;
import org.example.seminar5.hw.service.VendingMachineHotDrinks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductView {
    public static void clickButton() {
        VendingMachineBottles<BottleOfWater> bw = new VendingMachineBottles<>();
        List<BottleOfWater> waterList = new ArrayList<>(Arrays.asList(new BottleOfWater("pepsi", 42),
                new BottleOfWater("sprite", 40), new BottleOfWater("sprite", 100),
                new BottleOfWater("cola", 70)));
        bw.initProduct(waterList);
        System.out.println(bw.getProduct("sprite", 50).toString());

        VendingMachineHotDrinks<HotDrinks> hd = new VendingMachineHotDrinks<>();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(new HotDrinks("chocolate", 50, 65),
                new HotDrinks("coffee", 75, 65), new HotDrinks("hot coffee", 100, 95),
                new HotDrinks("tea", 45, 70)));
        hd.initProduct(hotDrinksList);
        System.out.println(hd.getProduct("coffee", 100, 65).toString());
    }
}
