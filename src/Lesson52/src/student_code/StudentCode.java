package Lesson52.src.student_code;

import java.util.HashMap;
import java.util.Map;

public class StudentCode {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1,"Anna");
        map.put(2,"Bob");
        map.put(3,"Gonzo");
        map.put(4,"Victor");
        map.put(5,"Woo");
        map.put(null,"Woo");
        map.put(-122,null);

        Map<Integer, String> anotherMap = new HashMap<>(map);
        anotherMap.putAll(map);

       if (!map.containsKey(1)){
           map.put(1,"John");
       }

//       for (Integer i : anotherMap.keySet()) {
//            System.out.printf("Key %d : value %s\n", i, map.get(i));
//        }

        System.out.println(map.get(1));
       if (map.containsKey(106660)){
           System.out.println(map.get("key 106660"+map.get(106660)));
       }

        System.out.println(map.get(-122));
//       map.remove(null) ;
        System.out.println(map.get(null));
        System.out.println(map.size());
        System.out.println("-----------------------------------------");
        map.values().forEach(i-> System.out.println(i));//get values

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            Integer key = entry.getKey();
            String value;
        }


    }

}
