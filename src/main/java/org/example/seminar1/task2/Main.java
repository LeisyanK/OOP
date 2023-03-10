package org.example.seminar1.task2;

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
        VendingMachine1 vendingMachine1 = new VendingMachine1();
        List<BottleOfWater> bw = new ArrayList<>(Arrays.asList(new BottleOfWater("pepsi", 42),
                new BottleOfWater("sprite", 40), new BottleOfWater("sprite", 100),
                new BottleOfWater("cola", 70)));
        vendingMachine1.initProduct(bw);
        System.out.println(vendingMachine1.getProduct("sprite").toString());
    }
}
