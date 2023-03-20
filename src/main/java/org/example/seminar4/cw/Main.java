package org.example.seminar4.cw;

import java.util.TreeSet;

/**
 * использование компаратора с классом Dog1
 * создали класс DogComparator с собственной логикой сравнения.
 */
public class Main {
    public static void main(String[] args) {
        DogComparator dogComparator = new DogComparator();
        TreeSet<Dog1> dogs = new TreeSet<>(dogComparator);
        dogs.add(new Dog1("Bobik", 4));
        dogs.add(new Dog1("Sharik", 10));
        dogs.add(new Dog1("Rex", 2));
        System.out.println(dogs);

        // для использования цепочки фильтрации используем thenComparing. Для этого необходимо сделать каст
        // - приведение типов (DogComparator)
//        DogComparator dogComparator1 = (DogComparator) new DogComparator().thenComparing(new DogNameComparator());
//        TreeSet<Dog1> dogs1 = new TreeSet<>(dogComparator);
//        dogs1.add(new Dog1("Bobik", 4));
//        dogs1.add(new Dog1("Sharik", 10));
//        dogs1.add(new Dog1("Rex", 2));
//        System.out.println(dogs1);
    }
}
