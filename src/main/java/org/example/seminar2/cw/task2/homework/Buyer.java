package org.example.seminar2.cw.task2.homework;

public abstract class Buyer implements BuyerBehaviour {
    protected String name;
    protected boolean isMakeOrderVar;
    protected boolean isTakeOrderVar;
    abstract String getName();
}
