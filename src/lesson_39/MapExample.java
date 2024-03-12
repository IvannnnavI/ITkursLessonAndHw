package lesson_39;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        //добавить пару ключ значение
        // возвращает старое значение, сооветствующее ключу ранее.
        System.out.println(map.put(1, "Hello"));
        map.put(2, "Java");
        map.put(3, "world");
        String oldValue = map.put(1,"Python");
        System.out.println("oldValue: " + oldValue);
        map.put(17,"orange");


        System.out.println(map);


        String value = map.get(17);
        System.out.println("value: " + value);
        System.out.println("====================================================================");

        String value1 = map.get(17);
        String defaultValue = "Defaut";
        if (value1 == null) value1 = defaultValue;
        System.out.println(value1);
        // V getOrDefault(Objeck key, V defaultValue)
        String valueCheckNull = map.getOrDefault(100,"NotNullValue");
        System.out.println("valueCheckNull "+valueCheckNull);

        // boolean containsKey (Objeck key) - вернет тру если есть такой ключ в словаре.
        // boolean containsValue(V value)

        System.out.println("map.containsKey(100) " + map.containsKey(100));
        System.out.println("map.map.containsValue(Java) " + map.containsValue("Java"));

        map.isEmpty();
        int size = map.size();
        // V remove - по ключу удаляет ключ значение
        System.out.println(map.remove(1,"Java"));
        System.out.println(map.remove(1,"Python"));
        System.out.println(map);

        System.out.println("=======================================================");
        // put vs replace
        map.replace(2,"Value");
        System.out.println(map);

        System.out.println("\n========================================\n");
        Set<Integer> keySet  = map.keySet();
        System.out.println(keySet);
        for (Integer key : map.keySet()) {
            System.out.println("Current value: " + map.get(key));
        }
        System.out.println("\n========================================\n");
            // Collections<V>map.values() - возвращает коллекцию
        Collection<String> collection = map.values();
        System.out.println(collection);

        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("===========================");
        }

        map.forEach((key,val) -> System.out.println("Key " + key + " | value: " + val));
        Map<Integer,String> newMap = new LinkedHashMap<>();
        newMap.put(77,"Kotlin");
        newMap.put(87,"Js");
        System.out.println(newMap);

        System.out.println(newMap);
        map.put(87,"DuplicateValue");
        System.out.println(map);

        newMap.putAll(map);
        System.out.println(newMap);
    }
}
