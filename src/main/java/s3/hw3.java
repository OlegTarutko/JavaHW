package s3;
/*
1. Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран.
2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
3. Вставить элемент в список в первой позиции.
4. Извлечь элемент (по указанному индексу) из заданного списка.
5. Обновить определенный элемент списка по заданному индексу.
6. Удалить третий элемент из списка.
7. Поиска элемента в списке по строке.
8. Создать новый список и добавить в него несколько элементов первого списка.
9. Удалить из первого списка все элементы отсутствующие во втором списке.
10. *Сортировка списка.
11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
*/

import java.util.*;


public class hw3 {
    public static void main(String[] args) {

// 1. Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран.
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");
        colors.add("Violet");
        System.out.println("1 задание: " + colors);

// 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, colors.get(i) + "!");
        }
        System.out.println("2 задание: " + colors);

// 3. Вставить элемент в список в первой позиции.
        colors.add(0, "Orange");
        System.out.println("3 задание: " + colors);

// 4. Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println("4 задание: " + colors.get(7));

// 5. Обновить определенный элемент списка по заданному индексу.
        colors.set(0, "Brown");
        System.out.println("5 задание: " + colors);

// 6. Удалить третий элемент из списка.
        colors.remove(2); // Если элемент 3 то индекс 2, если под индексом 3, то конечно 3.
        System.out.println("6 задание: " + colors);

// 7. Поиска элемента в списке по строке.
        String str = "Red!"; // Не понял нужно ли тут усложнить и цвет брать из консоли, если нет, то так.
        System.out.println("7 задание: Если цвет " + str + " - " + colors.contains(str));

// 8. Создать новый список и добавить в него несколько элементов первого списка.
        List<String> colors2 = colors.subList(0, 2);

        colors2.add("Gray");
        colors2.add("Yellow");
        System.out.println("8 задание: " + colors2);

// 9. Удалить из первого списка все элементы отсутствующие во втором списке.
        colors.retainAll(colors2);
        System.out.println("9 задание: " + colors);

// 10. *Сортировка списка.
        Collections.sort(colors);
        System.out.println("10 задание: " + colors);

// 11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
        ArrayList<String> list1 = new ArrayList<>();
        LinkedList<String> list2 = new LinkedList();
        int count = 150_000;

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list1.add(0, "элемент");
        }
        long end1 = System.currentTimeMillis();
        System.out.println("11 задание:\nСкорость ArrayList  " + (end1 - start1));


        long start2 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list2.add(0, "элемент");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Скорость LinkedList  " + (end2 - start2));

    }
}
