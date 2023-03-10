package org.example.seminar1.hw;

public class BottleOfWater extends Product {

    // конструктор
//    public BottleOfWater(){
//        super.name = "name1";
//    }
//    private String name;
//    private int price;

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
