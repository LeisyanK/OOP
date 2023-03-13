package org.example.seminar2.hw;

public class Human extends Buyer {

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
//        System.out.println("значение переменной isTakeOrderVar " + isTakeOrderVar);
        return isMakeOrderVar;
//        if (isMakeOrderVar) return true; // можно заменить строкой выше
//        else return false;
    }

    @Override
    public boolean isTakeOrder() {
//        System.out.println("значение переменной isTakeOrderVar " + isTakeOrderVar);
        return isTakeOrderVar;
    }
}
