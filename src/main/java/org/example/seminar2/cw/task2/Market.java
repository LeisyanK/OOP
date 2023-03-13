package org.example.seminar2.cw.task2;

import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour {
    List<Buyer> actors = new LinkedList<>();  // все посетители
    Queue<Buyer> actorsQueue = new ArrayDeque<Buyer>();  // все покупатели, которые встают в очередь
    @Override
    public void acceptToMarket(Buyer actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(Buyer actor) {
        System.out.println(actor.getName() + " покинул магазин");
        actors.remove(actor);
    }

    @Override
    public void update() {  // принимает и отдает заказы
        giveOrders();
        takeOrders();
    }

    @Override
    public void takeInQueue(Buyer actor) {
        System.out.println(actor.getName() + " встал в очередь");
        actorsQueue.add(actor);
    }

    @Override
    public void giveOrders() {
        System.out.println(actorsQueue.peek().getName() + " сделал заказ");
        actorsQueue.peek().isMakeOrder();
    }

    @Override
    public void takeOrders() {
        System.out.println(actorsQueue.peek().getName() + " забрал заказ");
        actorsQueue.peek().isTakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorsQueue.peek().getName() + " покинул очередь");
        actorsQueue.poll();
    }
}
