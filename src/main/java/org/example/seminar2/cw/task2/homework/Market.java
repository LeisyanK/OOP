package org.example.seminar2.cw.task2.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    public List<Buyer> actors = new ArrayList<>(); // LinkedList<>();  // все посетители
    public Queue<Buyer> actorsQueue = new ArrayDeque<Buyer>();  // все покупатели, которые встают в очередь

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
        System.out.println("  " + actor.getName() + " встал в очередь");
        actorsQueue.add(actor);
    }

    @Override
    public void giveOrders() {
        System.out.println("  " + actorsQueue.peek().getName() + " сделал заказ");
        actorsQueue.peek().isMakeOrder();
    }

    @Override
    public void takeOrders() {
        System.out.println("  " + actorsQueue.peek().getName() + " забрал заказ");
        actorsQueue.peek().isTakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        System.out.println("  " + actorsQueue.peek().getName() + " покинул очередь");
        actorsQueue.poll();
    }

    public String getInfoVisitors(List<Buyer> actors) {
        StringBuilder str = new StringBuilder("Market{");
        for (Buyer b : actors) {
            str.append(b.getName()).append(" ");
        }
        return str.toString() + '}';
    }

    public String getInfoBuyers(Queue<Buyer> actorsQueue) {
        StringBuilder str = new StringBuilder("Queue{");
        for (Buyer b : actorsQueue) {
            str.append(b.getName()).append(" ");
        }
        return str.toString() + '}';
    }
}
