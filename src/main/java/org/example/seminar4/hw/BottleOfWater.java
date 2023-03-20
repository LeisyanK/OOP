package org.example.seminar4.hw;

public class BottleOfWater extends Product {
    public BottleOfWater(String name, int price) {
        super(name, price);
//        this.name = name; // добавила вызов конструктора родителя
//        this.price = price;
    }
//    public BottleOfWater(){
//        super();
//    }


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
