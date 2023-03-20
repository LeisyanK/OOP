package org.example.seminar4.hw;

public abstract class VendingMachine <E>{
    private E name;

    public VendingMachine(E name) {
        this.name = name;
    }

    //    abstract void initProduct(List<> products);
    abstract String getProduct(String name);

}
