package org.example.seminar4.cw.task2;

import java.util.Comparator;

public class ComparableAnimal<T extends Animal> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        if (o1.age > o2.age) {
            return 1;
        } else if (o1.age < o2.age) {
            return -1;
        } else return 0;
    }
}
