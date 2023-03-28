package org.example.seminar6.hw.model;

public class BottleOfWater extends Product {
    public BottleOfWater(String name, int price) {
        super(name, price);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + this.name + '\'' +
                ", price=" + this.price +
                '}';
    }
}
