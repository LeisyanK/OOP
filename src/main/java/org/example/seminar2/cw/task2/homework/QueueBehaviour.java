package org.example.seminar2.cw.task2.homework;

public interface QueueBehaviour {
    void takeInQueue(Buyer actor);
    void giveOrders();
    void takeOrders();
    void releaseFromQueue();
}
