package org.example.seminar2.cw.task1;

public class Human extends Buyer{

    @Override
    String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrderVar = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrderVar = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrderVar;
//        if (isMakeOrderVar) return true; // можно заменить строкой выше
//        else return false;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrderVar;
    }
}
