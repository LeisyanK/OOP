package org.example.seminar4.cw;

import java.util.Comparator;

public class DogComparator implements Comparator<Dog1> {
    /**
     * Сравниваем два объекта по полю age. Можно вместо age подставить любое другое поле объекта (объекта Dog1 в данном случае)
     * Если поменять знак сравнения в условном операторе, то сортировка будет обратная.
     * Можно сравнивать строки, числа, сами объекты...
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Dog1 o1, Dog1 o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        } else return 0;
    }
//    @Override
//    public int compare(Dog1 o1, Dog1 o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//    @Override
//    public int compare(Dog1 o1, Dog1 o2) {
//        return compare(o1, o2);
//        return o1.compareTo(o2);
//    }

}
