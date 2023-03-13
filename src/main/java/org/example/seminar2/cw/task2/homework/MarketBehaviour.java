package org.example.seminar2.cw.task2.homework;

public interface MarketBehaviour {
    void acceptToMarket(Buyer actor);
    void releaseFromMarket(Buyer actor);
    void update();  // принимает и отдает заказы
}
