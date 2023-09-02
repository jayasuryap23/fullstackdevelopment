package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String[] args) {
        TreeSet<Character> ts =  new TreeSet<Character>();
        ts.add('a');
        ts.add('b');
        ts.add('c');
        ts.add('b');
        ts.add('a');
        ts.add('d');
        ts.add('e');
        Iterator its =  ts.iterator();
        while(its.hasNext())
        {
            System.out.println(its.next());
        }

    }
}
