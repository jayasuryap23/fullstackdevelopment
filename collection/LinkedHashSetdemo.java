package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetdemo
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> lhs =  new LinkedHashSet<Integer>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(1);
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(4);
        lhs.add(5);
        System.out.println(lhs);
        LinkedHashSet<String> list =  new LinkedHashSet<>();
        list.add("operating system");
        list.add("computer networks");
        list.add("sdlc");
        list.add("dbms");
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
}
