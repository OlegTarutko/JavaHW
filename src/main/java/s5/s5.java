package s5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class s5 {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("l0", "Z");
        hashMap.putIfAbsent("kl1", "Z");
        hashMap.remove("hi1");
        hashMap.put("ih1", "O");
        hashMap.put("oi2", "T");
        hashMap.put("gcv3", "T");
        hashMap.put("ty4", "F");

        hashMap.get("0");
        hashMap.getOrDefault("6", "def");

//        hashMap.forEach((k, v) -> System.out.println(k +" "+ v));

//        for (String s: hashMap.values()) {
//            System.out.println(s);
//        }
//
//        for (Integer s: hashMap.keySet()) {
//            System.out.println(s);
//        }

//        for (Integer s: hashMap.keySet()) {
//            System.out.println(hashMap.get(s));
//        }
//
//        for (Map.Entry<Integer, String> item : hashMap.entrySet()) {
//            System.out.printf("[%d, %s] ",item.getKey(), item.getValue());
//        }
//
//        for (int i = 0; i < hashMap.keySet().size(); i++) {
//            System.out.println(hashMap.get(hashMap.keySet().toArray()[i]));
//        }

        hashMap.containsValue("Z");
        hashMap.compute("3", (k, v) -> v += "!");
        hashMap.computeIfAbsent("5", v -> String.valueOf(System.currentTimeMillis())+"F!");
        hashMap.computeIfPresent("5", ( k, v ) -> v += "!");
        hashMap.merge("4", "?", (nV, tV) -> "<" + nV + tV + ">");
//        hashMap.forEach((k, v) -> System.out.println(k +" "+ v));

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("ih1", "O");
        linkedHashMap.put("oi2", "T");
        linkedHashMap.put("gcv3", "T");
        linkedHashMap.put("ty4", "F");
//        linkedHashMap.forEach((k, v) -> System.out.println(k +" "+ v));

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("ih1", "O");
        treeMap.put("oi2", "T");
        treeMap.put("gcv3", "T");
        treeMap.put("ty4", "F");
        treeMap.forEach((k, v) -> System.out.println(k +" "+ v));
        treeMap.tailMap("oi2", true);
        treeMap.headMap("oi2", false);

    }
}
