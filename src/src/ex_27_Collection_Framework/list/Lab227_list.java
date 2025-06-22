package ex_27_Collection_Framework.list;

import java.util.ArrayList;
import java.util.List;

public class Lab227_list {
    public static void main(String[] args) {
        List fruits = List.of("Orange", "mango","Watermelon","Guava");
        System.out.println(fruits);

        List arraylist = new ArrayList();
        arraylist.add("Sharik");
        arraylist.add(null);
        arraylist.add(123);
        arraylist.add(5.47);
        arraylist.add("Sayyad");
        arraylist.add(true);
        arraylist.add(false);
        System.out.println(arraylist);
        System.out.println(arraylist.size());
    }
}
