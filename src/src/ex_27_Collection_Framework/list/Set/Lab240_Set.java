package ex_27_Collection_Framework.list.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab240_Set {
    public static void main(String[] args) {

        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Sharik");
        hs.add("Sayyad");
        hs.add("Seeker");
        hs.add("Soon Success Insha allah");
        System.out.println(hs);
    }
}
