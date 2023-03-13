package org.example.seminar2.hw;

public abstract class Buyer implements BuyerBehaviour {
    protected String name;
    protected boolean isMakeOrderVar;
    protected boolean isTakeOrderVar;
    abstract String getName();
}
