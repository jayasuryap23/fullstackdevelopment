package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set =  new HashSet<String>();
        set.add("servlet");
        set.add("jsp");
        set.add("spring boot");
        set.add("spring mvc");
        set.add("hibernate");
        set.add("jsp");
        System.out.println(set.contains("spring boot"));
        set.isEmpty();

        Iterator itr  = set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
