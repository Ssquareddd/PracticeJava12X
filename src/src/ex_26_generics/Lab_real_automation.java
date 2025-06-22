package ex_26_generics;

import java.util.ArrayList;
import java.util.List;

public class Lab_real_automation {
    public static void main(String[] args) {

        List<Object> list_elemt = new ArrayList<>();
        list_elemt.add("Sharik");
        list_elemt.add(10);
        list_elemt.add(true);

        System.out.println(list_elemt);
    }
}

