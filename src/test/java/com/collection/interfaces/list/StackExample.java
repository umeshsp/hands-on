package com.collection.interfaces.list;

import org.junit.Test;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    @Test
    public void check() {
        Stack<Integer> stack = new Stack<Integer>();
        Iterator i = stack.iterator();
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
        stack.push(3);
        stack.push(4);
        System.out.println(stack.search(4));
        System.out.println(stack.contains(4));
        i = stack.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
