package HomeWork2;

//1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
//2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
//*3. Напишите программу, чтобы перевернуть строку с помощью рекурсии.
//4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168
//   Используем метод StringBuilder.append().
//5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
//6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
////*7. Сравнить время выполнения пункта 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.


import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        // 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку: ");
        StringBuilder string1 = new StringBuilder(scanner.nextLine());

        System.out.println("Введите вторую строку: ");
        StringBuilder string2 = new StringBuilder(scanner.nextLine());

        if (string1.toString().contains(string2.toString())) {
            System.out.println("Вхождение найдено.");
        } else System.out.println("Вхождения нет.");

        // 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
        StringBuilder stringReverse = string2.reverse();
        if (string1.toString().contains(stringReverse.toString())) {
            System.out.println("Вращение найдено.");
        } else System.out.println("Вращение не найдено.");

        // 4. Дано два числа, например 3 и 56, необходимо составить следующие строки:
        //   3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        System.out.println("Задание 4");
        System.out.println("Введите первое число: ");
        StringBuilder num1 = new StringBuilder(scanner.nextLine());

        System.out.println("Введи второе число: ");
        StringBuilder num2 = new StringBuilder(scanner.nextLine());

        int n1 = Integer.parseInt(num1.toString());
        int n2 = Integer.parseInt(num2.toString());

        System.out.println(sumOperation(num1, num2, n1, n2));
        System.out.println(diffOperation(num1, num2, n1, n2));
        System.out.println(multiOperation(num1, num2, n1, n2));

        //5. Замените символ “=” на слово “равно”.
        // Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        System.out.println(sumOperation(num1, num2, n1, n2)
                .deleteCharAt(sumOperation(num1, num2, n1, n2).indexOf("="))
                .insert(sumOperation(num1, num2, n1, n2).indexOf("="), "равно"));
        System.out.println(diffOperation(num1, num2, n1, n2)
                .deleteCharAt(diffOperation(num1, num2, n1, n2).indexOf("="))
                .insert(diffOperation(num1, num2, n1, n2).indexOf("="), "равно"));
        System.out.println(multiOperation(num1, num2, n1, n2)
                .deleteCharAt(multiOperation(num1, num2, n1, n2).indexOf("="))
                .insert(multiOperation(num1, num2, n1, n2).indexOf("="), "равно"));

        // 6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        System.out.println(sumOperation(num1, num2, n1, n2)
                .replace(sumOperation(num1, num2, n1, n2).indexOf("="),
                        sumOperation(num1, num2, n1, n2).indexOf("=") + 1, "равно"));
        System.out.println(diffOperation(num1, num2, n1, n2)
                .replace(diffOperation(num1, num2, n1, n2).indexOf("="),
                        diffOperation(num1, num2, n1, n2).indexOf("=") + 1, "равно"));
        System.out.println(multiOperation(num1, num2, n1, n2)
                .replace(multiOperation(num1, num2, n1, n2).indexOf("="),
                        multiOperation(num1, num2, n1, n2).indexOf("=") + 1, "равно"));

    }




    public static StringBuilder sumOperation(StringBuilder num1, StringBuilder num2, int n1, int n2) {

        int sumInt = n1 + n2;
        StringBuilder sum = new StringBuilder(num1.toString())
                .append(" + ")
                .append(num2)
                .append(" = ")
                .append(sumInt);
        return sum;
    }

    public static StringBuilder diffOperation(StringBuilder num1, StringBuilder num2, int n1, int n2) {

        int diffInt = n1 - n2;
        StringBuilder diff = new StringBuilder(num1.toString())
                .append(" - ")
                .append(num2)
                .append(" = ")
                .append(diffInt);
        return diff;
    }

    public static StringBuilder multiOperation(StringBuilder num1, StringBuilder num2, int n1, int n2) {

        int multiInt = n1 * n2;
        StringBuilder multi = new StringBuilder(num1.toString())
                .append(" * ")
                .append(num2)
                .append(" = ")
                .append(multiInt);
        return multi;
    }
}
