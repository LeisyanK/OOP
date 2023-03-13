package org.example.seminar2.hw;

import java.util.*;

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
//        List<Buyer> visitors = new LinkedList<>();  // все посетители
//        Queue<Buyer> buyers = new ArrayDeque<>();  // все покупатели, которые встают в очередь

        Market market = new Market();   // запускаем работу магазина

        Human man1 = new Human();
        man1.name = "Ваня";
        market.acceptToMarket(man1);
        System.out.println(market.getInfoVisitors(market.actors));
        System.out.println(market.getInfoBuyers(market.actorsQueue));

        int i = 1;
        Random r = new Random();
        while (i > -1 && i < 5) {       // вместо i<5 правильно использовать "текущее время < время закрытия"
            int num = r.nextInt(2);
//            System.out.println("Зашел новый посетитель: " + num);
            if (num == 1) {  // зашел посетитель
                Human man = new Human();
                man.name = "Посетитель" + i;
                market.acceptToMarket(man);
                System.out.println(market.getInfoVisitors(market.actors));
                System.out.println(market.getInfoBuyers(market.actorsQueue));
                i++;
            } else {
                for (Buyer a : market.actors) {
                    num = r.nextInt(2);
//                    System.out.println(a.getName() + "попал в очередь: " + num);
                    if (num == 1 && !market.actorsQueue.contains(a)) {  // встает в очередь
                        market.takeInQueue(a);
                        System.out.println(market.getInfoVisitors(market.actors));
                        System.out.println(market.getInfoBuyers(market.actorsQueue));
                    }
                }
//                System.out.println(market.getInfoVisitors(market.actors));
//                System.out.println(market.getInfoBuyers(market.actorsQueue));
//                i++;
                if (!market.actorsQueue.isEmpty()) {
                    market.update(); // покупает первый в очереди
                    String buyerName = market.actorsQueue.peek().getName();
//                    System.out.println(buyerName);
//                    int index =market.actors.indexOf(buyerName);
//                    System.out.println(index);
                    market.releaseFromQueue();
                    for (int j = 0; j < market.actors.size(); j++) {
                        if (market.actors.get(j).getName().equals(buyerName))
                            market.releaseFromMarket(market.actors.get(j));
                    }
//                    market.releaseFromMarket(market.actors.get(index));//market.actorsQueue.peek());
                }
            }
        }
        System.out.println("Магазин скоро закроется!");
        if (!market.actorsQueue.isEmpty()) {
            for (Buyer b : market.actorsQueue) {
                market.update(); // покупает первый в очереди
                String buyerName = market.actorsQueue.peek().getName();
//                System.out.println(buyerName);
                market.releaseFromQueue();
                for (int j = 0; j < market.actors.size(); j++) {
                    if (market.actors.get(j).getName().equals(buyerName))
                        market.releaseFromMarket(market.actors.get(j));
                }
                System.out.println(market.getInfoVisitors(market.actors));
                System.out.println(market.getInfoBuyers(market.actorsQueue));
            }
        }
        while (!market.actors.isEmpty()) {
            int num = r.nextInt(2);
            if (num == 1) {
                market.takeInQueue(market.actors.get(0));
                market.update();
                market.releaseFromQueue();
            }
            market.releaseFromMarket(market.actors.get(0));
            System.out.println(market.getInfoVisitors(market.actors));
//            System.out.println(market.getInfoBuyers(market.actorsQueue));
        }
//        if (!market.actors.isEmpty()) {
//
//            for (Buyer b : market.actors) {
//                market.takeInQueue(b);
//                market.update();
//                market.releaseFromQueue();
//                market.releaseFromMarket(b);
//                System.out.println(market.getInfoVisitors(market.actors));
//                System.out.println(market.getInfoBuyers(market.actorsQueue));
//            }
//        }
        System.out.println("Все покупатели вышли. Магазин закрыт.");

//        Market market = new Market();
//        market.acceptToMarket(man1);
//        market.takeInQueue(man1);
//        market.update();
//        market.giveOrders();
//        market.takeOrders();
//        market.releaseFromQueue();
//        market.releaseFromMarket(man1);
        //market.update();
    }

//    public void oneBuyer(){
//
//    }

}
