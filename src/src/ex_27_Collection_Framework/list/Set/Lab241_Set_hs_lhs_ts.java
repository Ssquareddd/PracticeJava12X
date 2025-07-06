package ex_27_Collection_Framework.list.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab241_Set_hs_lhs_ts {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        // Hashing mechanism to store the element not driver
        // no duplicates

        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Guava");
        hs.add(null);
        System.out.println(hs);

        System.out.println("-------------------------------------");

        Set lhs = new LinkedHashSet();
        // linkedlist mechanism to store the element
        // order will maintain, no duplicates

        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Grapes");
        lhs.add("Pomagranate");
        lhs.add("Kiwi");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println("--------------------------------");

        Set ts = new TreeSet();
        // Black and red Tree mechanism to store the element
        // order will maintain, Natural Sorting is done.

        ts.add("Apple");
        ts.add("Orange");
        ts.add("Banana");
        ts.add("Watermelon");
        ts.add("Null");

        //ts.add(123);// java.lang.ClassCastException
        //ts.add(null); // java.lang.NullPointerException
        System.out.println(ts);

    }
}
