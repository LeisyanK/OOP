package org.example.seminar1.task1;

/**
 * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы initProducts
 * (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
 */
public class Product {
    private String name;
    private int cost;

//    public static String text;
//    public String notStatic;
//
//    public Product(String text, String notStatic){
//        this.notStatic = notStatic;
//        Product.text = text;
//    }
//    public Product(){
//        this.notStatic = "notStatic";
//        Product.text = "text";
//    }
//    public String getNotStatic() {
//        return notStatic;
//    }
//    public void setNotStatic(){
//        this.notStatic = "Hello";
//    }
//    @Override
//    public String toString() {
//        return "Product{" +
//                "notStatic='" + notStatic + '\'' +
//                "Static='" + text + '\'' +
//                '}';
//    }


    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
