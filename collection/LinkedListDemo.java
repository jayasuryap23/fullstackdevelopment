package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo
{
    public static void main(String[] args)
    {
        LinkedList <String> list =  new LinkedList<String>();
        list.add("html");
        list.add("css");
        list.add("bootstrap");
        list.add("javascript");
        list.add("React js ");
        list.add("Node js ");
        list.add("Mongodb");
        list.add("express js");
        System.out.println(list);

        LinkedList<String> li  =  new LinkedList<>();
        li.addAll(list);
        System.out.println(" new list is :"+li);
        li.add(8,"next js");
        li.add(9,"electron js ");
        Iterator itr = li.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
