package Sem3;

import java.util.*;

public class s3 {

    public static void main(String[] args) {

        int a = 1;
        String s = "";
        int[] ar = new int[5];

        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("true");
        list.add("Привет!");
        list.add(1, "One");
        list.add("2");
        list.add("3");
        list.add("4");
        list.set(1, "Two");

        String s1 = list.get(1);
//        list.remove(1);
//        System.out.println(list.remove("Two"));
//        System.out.println(list.remove("Two"));
        String[] j = new String[list.size()];
        list.toArray(j);

        List<String> list1 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        list1.add("1");
        list1.add("true");
        list1.add("Привет!");
        list1.add(1, "One");


//        list.subList(1, 12);
//        list.forEach(n -> System.out.println(n));

//        for (String str: list) {
//            str = "r";
//        }

        ListIterator<String> iterator = list.listIterator(list.size()-1);
        while (iterator.hasPrevious()){
            String str = iterator.previous();
//            iterator.remove();
        }

        // size > 10 -> size = size*2+1
        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
        }

//        System.out.println(list);
//        System.out.println(list1);
//        System.out.println("-".repeat(16));
//        list.retainAll(list1);
//        list.removeAll(list1);
//        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<>();

        list2.add(0, "Tr");

        Collections.sort(list3);
        list.forEach(n -> list3.add(0, n));
    }

}
