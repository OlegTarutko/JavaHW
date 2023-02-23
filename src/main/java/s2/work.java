package Sem2;

import java.util.Scanner;

public class work {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите первую строку: ");
////        String first = scanner.nextLine();
//        StringBuilder first = new StringBuilder(scanner.nextLine());
//
//
//        System.out.println("Введите вторую строку: ");
////        String second = scanner.nextLine();
//        StringBuilder second = new StringBuilder(scanner.nextLine());
//
//        System.out.println(first);
//        System.out.println(second);
//
//        System.out.println(first.toString().contains(second.toString())); // Вхождение одной строки в другую.
////        if(first.toString().contains(second.toString())) {
////            System.out.println("Совпадает");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первую строку: ");
//        StringBuilder first = new StringBuilder(scanner.nextLine());
//
//
//        System.out.println("Введите вторую строку: ");
//        StringBuilder second = new StringBuilder(scanner.nextLine());
//
//        System.out.println(first);
//        System.out.println(second);
//
////        System.out.println(first.toString().contains(second.toString())); // Вхождение одной строки в другую.
//        if (first.toString().contains(second.toString())) {
//            System.out.println(first.toString().replace(second, "удалено"));
//        } else System.out.println("совпадений нет");

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первую строку: ");
//        StringBuilder first = new StringBuilder(scanner.nextLine());
//
//
//        System.out.println("Введите вторую строку: ");
//        StringBuilder second = new StringBuilder(scanner.nextLine());
//
//        System.out.println(first);
//        System.out.println(second);
//
//
//        if (first.toString().contains(second.toString())) {
//            int startIndex = first.indexOf(second.toString());
//            int endIndex = startIndex + second.length();
//            System.out.println(startIndex);
//            System.out.println(endIndex);
//            System.out.println(first.replace(startIndex, endIndex, "совпадение заменено"));
//        } else System.out.println("совпадений нет");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        StringBuilder first = new StringBuilder(scanner.nextLine());


        System.out.println("Введите вторую строку: ");
        StringBuilder second = new StringBuilder(scanner.nextLine());

//        System.out.println(first);
//        System.out.println(second);


        if (first.toString().contains(second.toString())) {
            long begin = System.currentTimeMillis();            // Старт замера
            System.out.println(first.toString().replace(second, "совпадение заменено"));
            long end = System.currentTimeMillis();             // Конец замера
            System.out.println(end - begin);                   // Результат
        } else System.out.println("совпадений нет");


        if (first.toString().contains(second.toString())) {
            long begin = System.currentTimeMillis();              // Старт замера
            int startIndex = first.indexOf(second.toString());
            int endIndex = startIndex + second.length();
//            System.out.println(startIndex);
//            System.out.println(endIndex);
            System.out.println(first.replace(startIndex, endIndex, "совпадение заменено"));
            long end = System.currentTimeMillis();               // Конец замера
            System.out.println(end - begin);                     // Результат
        } else System.out.println("совпадений нет");
    }
}
