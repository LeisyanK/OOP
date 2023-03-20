package org.example.seminar4.cw.task2;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ListOfDogs listDogs = new ListOfDogs();
        listDogs.setDogList(Arrays.asList(
                new Dog("Bobik", 5),
                new Dog("Polcan", 3),
                new Dog("Sharik", 9)
        ));
        ComparableOfNameDog comp = new ComparableOfNameDog();
        Iterator<Dog> iter = listDogs.iterator();
        while (iter.hasNext()){
            comp.compare(iter.next(), iter.next());
        }
        listDogs.forEach(System.out::println);
    }
}
