package org.example.seminar4.cw.task2;

import java.util.Iterator;
import java.util.List;

public class ListOfDogIterator implements Iterator<Dog> {
    private List<Dog> dogListIterator;
    public static int count = 0;
    public ListOfDogIterator(List<Dog> dogList){
//        count = 0;  // начальное присвоение перенесли из конструктора в описание переменной
        //чтобы не было зацикливания в while
        this.dogListIterator = dogList;
    }
    @Override
    public boolean hasNext() {
//        count++;
//        System.out.println("hasNext:"+count);
        return count < dogListIterator.size();
    }

    @Override
    public Dog next() {
        if (!hasNext()){
            return null;
        }
//        count++;
//        System.out.println("next: "+count);
        return dogListIterator.get(count);
    }
}
