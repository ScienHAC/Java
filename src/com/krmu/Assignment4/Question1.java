package com.krmu.Assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question1 {
    public static void run() {
        System.out.println("=== Question 1: Collections - Sorting Strings ===");

        List<String> names = new ArrayList<>();
        names.add("Zebra");
        names.add("Apple");
        names.add("Mango");
        names.add("Banana");
        names.add("Cherry");

        System.out.println("Original List: " + names);

        Collections.sort(names);
        System.out.println("Ascending Order: " + names);

        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Descending Order: " + names);

        System.out.println();
    }
}

