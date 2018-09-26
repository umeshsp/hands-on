package com.collection.interfaces.queue;

import java.util.*;

public class QueueExample {

    public static void main(String[] args) {
        PriorityQueue<String> stringQueue = new PriorityQueue<String>();
        stringQueue.add("umesh");
        stringQueue.add("is");
        stringQueue.add("isa");
        stringQueue.add("iass");
        stringQueue.add("ewrer");
        stringQueue.add("ewrwerewr");

        PriorityQueue<Integer> integerQueue = new PriorityQueue<Integer>();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(4);
        integerQueue.add(5);
        integerQueue.add(6);

        integerQueue.remove();
        integerQueue.remove();

        Iterator iterator = stringQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("***");
        Iterator iterator2 = integerQueue.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
