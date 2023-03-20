package org.example.seminar4.hw;

/**
 * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы initProducts
 * (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
 */
public abstract class Product{
//    protected String name;
    protected String name;
    protected int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }
}
