package org.example.seminar4.cw;

import java.util.Iterator;
import java.util.List;

public class CatHome implements Iterator<Cat> {
    private int catCounter;
    private List<Cat> cats;

    public CatHome(List<Cat> cats) {
//        this.catCounter = 0;
        this.cats = cats;
    }

    @Override
    public boolean hasNext() {
        return catCounter < cats.size() - 1;
    }

    @Override
    public Cat next() {
        if (!hasNext()) {
            return null;
        }
        catCounter++;
        return cats.get(catCounter);
    }
}
