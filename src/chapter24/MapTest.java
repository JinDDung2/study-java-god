package chapter24;

import java.util.*;

public class MapTest {

    public void checkHashMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        System.out.println(map.get("A"));
        System.out.println(map.get("B")); // null
        System.out.println("------------------");
        map.put("A", "changeA");
        map.put("B", "changeB");
        map.put("C", "changeC");
        map.put("D", "changeD");
        System.out.println(map.get("A"));
        System.out.println("------------------");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println("key = " + key);
            System.out.println("value = " + map.get(key));
        }
        System.out.println("------------------");
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println("value = " + value);
        }
        System.out.println("------------------");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.printf("key=%s, value=%s%n", entry.getKey(), entry.getValue());
        }
        System.out.println("------------------");
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("Z"));
        System.out.println(map.containsValue("changeA"));
        System.out.println(map.containsValue("changeZ"));
    }
    public static void main(String[] args) {
        MapTest m = new MapTest();
        m.checkHashMap();
        System.out.println("------------------");
        Properties properties = System.getProperties();
        Set<Object> keySet = properties.keySet();
        for (Object o : keySet) {
            System.out.printf("%s%n=%s%n", o, properties.get(o));
        }

    }
}
