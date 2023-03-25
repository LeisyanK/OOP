package org.example.seminar5.hw.model;

import org.example.seminar5.hw.model.Product;

public class HotDrinks extends Product {
    private int temperature;

    public HotDrinks(String name, int price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrinks{" +
                "temperature=" + temperature +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
