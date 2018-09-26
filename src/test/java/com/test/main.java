package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("w:/a\\bc::/12\\xyz");
        List<Integer> res = hacker2.commandCount(list);
        Iterator it = res.iterator();
        while (it.hasNext())
            System.out.println("result:" + it.next());
    }
}