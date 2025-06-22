package ex_27_Collection_Framework.list;

import java.util.Vector;

public class Lab229_vector {
    public static void main(String[] args) {
        Vector v = new Vector<>();

        v.add("Sharik");
        v.add("Arif");
        v.add("Sayyad");
        System.out.println(v);
        v.remove("Sharik");
        System.out.println(v);
        System.out.println(v.contains("Sayyad"));


        v.hashCode();
    }
}
