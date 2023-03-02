package s5;

import java.util.HashMap;

public class hw5 {
    public static void main(String[] args) {
        // Создать множество, ключ и значение строки. Добавить шесть элементов. Вывести в консоль значения.
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("Первый", "Красный");
        hm1.put("Второй", "Белый");
        hm1.put("Третий", "Синий");
        hm1.put("Четвертый", "Желтый");
        hm1.put("Пятый", "Оранжевый");
        hm1.put("Шестой", "Зеленый");
        hm1.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println(hm1);

        // Добавить ко всем значениям символ "!".
        for (String key : hm1.keySet()) {
            hm1.compute(key, (k, v) -> v + "!");
        }
        System.out.println(hm1);


        // Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключами первого.
        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("Первый", "Автомобиль");
        hm2.put("Третий", "Велосипед");
        hm2.put("Пятый", "Мотоцикл");
        hm2.put("Седьмой", "Автобус");
        hm2.put("Восьмой", "Вертолет");
        hm2.put("Девятый", "Самолет");
        System.out.println(hm2);

        // Объединить значения во втором множестве и первом, если ключи совпадают. Вывести результат в консоль.
        for (String item : hm2.keySet()) {
            hm2.merge(item, hm1.getOrDefault(item, "Def"), (nV, tV) -> nV + tV);
        }
        System.out.println("*".repeat(30));
        System.out.println(hm2);
        hm2.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
