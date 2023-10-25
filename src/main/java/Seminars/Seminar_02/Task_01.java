package Seminars.Seminar_02;

import java.util.Scanner;
/*===============================================================
Реализовать метод, принимающий 2 символа c1 и c2 и четное число n,
который возвращает строку, состоящую из символов c1c2 длины n.
Пример: (c1 = 'a', c2 = 'b', n = 6 => "ababab")
 ===============================================================*/
public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input c1: ");
        String c1 = scanner.nextLine();

        System.out.print("Input c2: ");
        String c2 = scanner.nextLine();

        System.out.print("Input n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("c1 = " + c1 +
                ", c2 = " + c2 +
                ", n = " + n +
                "\nresult string: " + resultString(c1, c2, n));
    }

    public static StringBuilder resultString(String c1, String c2, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) stringBuilder.append(c1);
            else stringBuilder.append(c2);
        }
        return stringBuilder;
    }
}
