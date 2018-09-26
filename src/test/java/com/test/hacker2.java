package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hacker2 {
    static List<Integer> commandCount(List<String> commands) {
        Iterator it = commands.iterator();
        String command = null;
        List <Integer> count = new ArrayList<Integer>();
        while (it.hasNext()){
            command = it.next().toString();
            System.out.println("Command is "+ command);
           // Matcher matcher = Pattern.compile("[a-z][a-z0-9;]*/[a-z0-9]*\\[a-z]*").matcher(command);
              Matcher matcher = Pattern.compile("[a-z][a-z0-9:]*\\/[a-z0-9]*\\[a-z]*").matcher(command);
            //[a-z0-9;]*/[a-z0-9]*[a-z]*
            if(matcher.find()){
              //  matcher.group(1);
                System.out.println("found "+ matcher.group(0));
            }

           // System.out.println(splitCommand);
        }
        return count;
    }

}
