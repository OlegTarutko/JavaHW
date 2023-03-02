package s5;

import java.util.HashMap;

public class s5work {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Первый", "Василий");
        hm.put("Второй", "Кеша");
        hm.put("Третий", "Павел");
        hm.put("Четвертый", "Олег");
        hm.put("Пятый", "Константин");
        hm.put("Шестой", "Геннадий");
        hm.put("Седьмой", "Владимир");
        hm.put("Восьмой", "Алексей");
//        System.out.println(hm.putIfAbsent("Девятый", "Кеша"));
//        System.out.println(hm.getOrDefault("Восьмой", "def"));
//        hm.forEach((k, v) -> System.out.println(k+ " : " +v));
        for (String v : hm.values()) {
            System.out.println(v);
        }
        for (String k : hm.keySet()) {
            System.out.println(k);
        }
        for (String key : hm.keySet()) {
            hm.compute(key, (k, v) -> "<" + v + ">");
        }
        System.out.println(hm);

        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("Первый", "Ольга");
        hm2.put("Второй", "Анна");
        hm2.put("Третий", "Анастасия");
        hm2.put("Девятый", "Вероника");
        System.out.println(hm2);
        System.out.println("-".repeat(20));

        for (String item: hm2.keySet()) {
            hm2.merge(item, hm.getOrDefault(item," def"), (nV, tV) -> nV + tV);
        }
        System.out.println(hm2);


    }
}
