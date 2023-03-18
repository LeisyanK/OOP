package org.example.seminar3.task1;

import java.util.Iterator;
import java.util.List;

/**
 * Создать класс Dog и добавить возможность итерирования по нему.
 */
public class Main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatList(List.of(new Cat("Barsik"), new Cat("Murzik"), new Cat("Pushok")));
        System.out.println(cats.iterator().next());
//        while (cats.iterator().hasNext()) {
//            System.out.println(cats.iterator().next().toString());
//
//        }


        ListOfDogs dogs = new ListOfDogs();
        dogs.setDogList(List.of(new Dog("Jack"), new Dog("Sharik"), new Dog("Tarzan")));
//        System.out.println(dogs.iterator().next());
        Iterator<Dog> dogIterator = dogs.iterator();
        while (dogIterator.hasNext()) {
//            ListOfDogIterator.count++;
            System.out.println(dogs.iterator().next().toString());
            ListOfDogIterator.count++;

        }

    }
}
