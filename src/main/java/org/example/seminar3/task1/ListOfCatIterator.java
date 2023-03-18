package org.example.seminar3.task1;

import java.util.Iterator;
import java.util.List;

public class ListOfCatIterator implements Iterator<Cat> {
    private List<Cat> catListIterator;
    private int counter;
    public ListOfCatIterator(List<Cat> catList){
        catListIterator = catList;
        counter = 0;
    }
    @Override
    public boolean hasNext() {
        return counter < catListIterator.size() - 1;
    }

    @Override
    public Cat next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return catListIterator.get(counter);
    }
}
