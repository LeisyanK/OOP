package org.example.seminar6.hw.model;

public class HotDrinks extends Product {
    private int temperature;

    public HotDrinks(String name, int price, int temperature) {
        super(name, price);
//        super();
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
