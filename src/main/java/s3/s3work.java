package Sem3;

import java.util.ArrayList;
import java.util.ListIterator;

public class s3work {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Первый");
        list.add("Второй");
        list.add("Третий");
        list.add("Четвертый");
        list.add("Пятый");
        list.add("Шестой");
        list.add("Седьмой");
        System.out.println(list);

        ArrayList<String> list5 = new ArrayList<>();

        list5.add("Первый");
        list5.add("Десятый");
        list5.add("Третий");
        list5.add("Четвертый");
        list5.add("Три");
        list5.add("Шестой");
        list5.add("Седьмой");
        System.out.println(list);

        for (String el : list) {
            System.out.println(el);
        }
        System.out.println("-".repeat(20));


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-".repeat(20));


        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String el = iterator.next();
            System.out.println(el);
        }
        System.out.println("-".repeat(20));


        ArrayList<String> list2 = new ArrayList<>(); // Разворот
        for (int i = list.size() - 1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        System.out.println(list2);
        System.out.println("-".repeat(20));


        ArrayList<String> list3 = new ArrayList<>(); // Разворот
        iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            list3.add(iterator.previous());
        }
        System.out.println(list3);
        System.out.println("-".repeat(20));


        ArrayList<String> list4 = new ArrayList<>(); //разворот forEach
        list.forEach(n -> list4.add(0, n));
        System.out.println(list4);
        System.out.println("-".repeat(20));


        int sum = 0;
        iterator = list.listIterator();
        while (iterator.hasNext()) {
            String el = iterator.next();
            sum += el.length();
        }
        int average = sum / list.size();

        iterator = list.listIterator();
        while (iterator.hasNext()) {
            String el = iterator.next();
            if (el.length() < average) {
                iterator.remove();
            }
        }
        System.out.println(list);

        list5.removeAll(list);
        System.out.println(list5);




    }
}
