package ex_27_Collection_Framework.list.MAP;

import java.util.HashMap;
import java.util.Map;

public interface Lab245_Map_P {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id",12);
        map.put("id2",52);
        map.put("id3",32);
        map.put("id4",18);
        map.put(null,122);
        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id3"));
        System.out.println(map.containsValue(18));

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.get("id1"));
        return;
    }
}
