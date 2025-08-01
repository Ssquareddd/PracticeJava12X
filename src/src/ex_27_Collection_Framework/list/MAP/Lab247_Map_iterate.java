package ex_27_Collection_Framework.list.MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Lab247_Map_iterate {
    public static void main(String[] args) {
        Map<String, Integer>map = new HashMap<>();
        map.put("id",1);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",null);
        map.put(null,100);

        System.out.println(map);
        System.out.println(map.size());

        for(Map.Entry<String,Integer> item:map.entrySet()){
            System.out.println(item.getKey() + " ->" + item.getValue());
        }
    }
}
