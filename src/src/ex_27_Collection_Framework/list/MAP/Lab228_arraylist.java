package ex_27_Collection_Framework.list.MAP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab228_arraylist {
    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("1");
        list.add("41");
        list.add("10");
        list.add("13");
        list.add("5");
        list.add(true);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("3"));

        System.out.println(list);

        for (int i = 0;i< list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("----------------------------");
        for (Object o:list){
            System.out.println(o);
        }
        System.out.println("------------------------------");

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
