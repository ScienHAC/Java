package com.krmu.Assignment4;

import java.util.*;

public class Question4 {
    public static void run() {
        System.out.println("=== Question 4: Collections Framework ===");

        System.out.println("1. List Interface (ArrayList):");
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        System.out.println("ArrayList: " + list);

        System.out.println("\n2. Set Interface (HashSet):");
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        System.out.println("HashSet: " + set);

        System.out.println("\n3. Queue Interface (LinkedList):");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue: " + queue);
        System.out.println("Poll: " + queue.poll());

        System.out.println("\n4. Map Interface (HashMap):");
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 85);
        map.put("Alice", 92);
        map.put("Bob", 78);
        System.out.println("HashMap: " + map);

        System.out.println();
    }
}

