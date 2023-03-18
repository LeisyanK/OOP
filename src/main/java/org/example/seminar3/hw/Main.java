package org.example.seminar3.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> catList = new ArrayList<>(Arrays.asList(
                new Cat("Barsik", 7),
                new Cat("Murzik", 2),
                new Cat("Murka", 5)));
        System.out.println(catList);
        Collections.sort(catList);
        System.out.println(catList);
    }
}
