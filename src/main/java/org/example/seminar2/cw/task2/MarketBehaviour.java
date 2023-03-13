package org.example.seminar2.cw.task2;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Buyer actor);
    void releaseFromMarket(Buyer actor);
    void update();  // принимает и отдает заказы
}
