package ex_27_Collection_Framework.list.MAP;

import java.util.*;

public class Lab246_map_real {
    public static void main(String[] args) {

        Map<String, Object> student1 = new HashMap();
        student1.put("name","Sayyad");
        student1.put("phone","9821310282");
        student1.put("Country","IND");
        student1.put("address","BMB");

        System.out.println(student1);

        Map<String, Object> student2 = new LinkedHashMap<>();
        student2.put("Name","sayyad");
        student2.put("phoneno","0892758422");
        student2.put("Country","IRE");
        student2.put("address","DUB");

        System.out.println(student2);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich Dad poor Kid");
        book_read_items.add("Rixh Kid Rich Family");
        book_read_items.add("Money Imp");
        book_read_items.add("Religion Important");
        book_read_items.add("Be good to Peoples");
    }
}
