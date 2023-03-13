package org.example.seminar2.cw.task2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди,
 * принятие/отдача заказа
 * 2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей, обновление
 * состояния магазина
 * 3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке список людей
 * в очереди в различных статусах
 */
public class Main {
    public static void main(String[] args) {
//        List<Buyer> actors = new LinkedList<>();  // все посетители
//        Queue<Buyer> actorsQueue = new ArrayDeque<>();  // все покупатели, которые встают в очередь

        Human man1 = new Human();
        man1.name = "Ваня";

        Market market = new Market();
        market.acceptToMarket(man1);
        market.takeInQueue(man1);
        market.update();
//        market.giveOrders();
//        market.takeOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(man1);
        //market.update();
    }

}
