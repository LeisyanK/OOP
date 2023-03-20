package org.example.seminar4.cw.task2;

import java.util.Comparator;

public class ComparableOfNameDog <T extends Animal> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
