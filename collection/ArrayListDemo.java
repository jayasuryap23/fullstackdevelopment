package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> list =  new ArrayList<String>();
        list.add("c");
        list.add("c++");
        list.add("java");
        list.add("python");
        list.add("node js ");
        Iterator it = list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        list.remove("node js ");
        list.add(4,"Asp.net");
        list.add("Spring boot");
        list.add("Angular js");
        Iterator i = list.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println(list);
    }
}
