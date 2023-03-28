package org.example.seminar6.hw.model;

/**
 * Создать абстрактный класс и описать методы, реализация этих методов будет в наследниках
 */
public class ProductBuilder {
    private static ProductBuilder  instance = null;
    Product obj;

    private ProductBuilder () {}

    public static ProductBuilder getInstance() {
        if (instance == null)
            instance = new ProductBuilder();
        instance.obj = new Product();

        return instance;
    }

    public ProductBuilder setName(String name) {
        obj.setName(name);
        return this;
    }

    public ProductBuilder setPrice(int price) {
        obj.setPrice(price);
        return this;
    }

    public Product build() {
        return obj;
    }

    @Override
    public String toString() {
        return "ProductBuilder{" +
                "obj=" + obj +
                '}';
    }
}
