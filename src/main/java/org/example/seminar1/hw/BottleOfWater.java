package org.example.seminar1.hw;

public class BottleOfWater extends Product {



    public BottleOfWater(String name, int price) {
        super(name, price);
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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
