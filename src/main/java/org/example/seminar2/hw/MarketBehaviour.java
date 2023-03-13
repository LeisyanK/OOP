package org.example.seminar2.hw;

public interface MarketBehaviour {
    void acceptToMarket(Buyer actor);
    void releaseFromMarket(Buyer actor);
    void update();  // принимает и отдает заказы
}
