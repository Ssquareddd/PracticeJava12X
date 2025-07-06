package ex_27_Collection_Framework.list.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lab244_Map_P1 {
    public static void main(String[] args) {

        //Map m1 = new Map();

        //You can also add keys as any other data types.
        /*
        m1.put("name","sharik");
        m1.put("rollno", "sharik");
        m1.put(true,"sharik");
        m1.put(3.14,"sharik");
         */

        Map m1 = new HashMap();
        // Map is key - value
        // name : sharik,
        // rollno : 1
        // phone : 9876543210

        // PUT - put the key wit the value into the map
        m1.put("name","sharik");
        m1.put("rollno",1);
        m1.put("phone",983121028);
        System.out.println(m1);

        Map m2 = new LinkedHashMap();
        m2.put("name","sayyad");
        m2.put("rollno",15);
        m2.put("phoneno",982131028);
        System.out.println(m2);

        Map m3 = new LinkedHashMap();
        // Map is key - value
        // name : sharik,
        // rollno : 1
        // phone : 9876543210

        m3.put("name","sharik");
        m3.put("rollno",2);
        m3.put("phoneno",982131028);
        System.out.println(m3);
    }
}
