package org.example.seminar2.hw;

public interface QueueBehaviour {
    void takeInQueue(Buyer actor);
    void giveOrders();
    void takeOrders();
    void releaseFromQueue();
}
