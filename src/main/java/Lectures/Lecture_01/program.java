package Lectures.Lecture_01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class program {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, world!");


        short age = 10;
        int salary = 123456;
        System.out.println(age);
        System.out.println(salary);

        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e);
        System.out.println(pi);

        char ch = '1';
        System.out.println(Character.isDigit(ch));  // true
        ch = 'a';
        System.out.println(Character.isDigit(ch));  // false

        boolean flag1 = 123 <= 234;
        System.out.println(flag1);                  // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2);                  // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3);                  // false
        System.out.println(getType(flag3));         // Boolean

        var i = 123.45;                             // неявная типизация
        System.out.println(getType(i));             // Double

        System.out.println(Integer.MAX_VALUE);      // 2147483647

        String s = "qwerty";
        System.out.println(s.charAt(1));

        int a = 123;
        a++;                                        // 124
        System.out.println(a++);                    // 123
        System.out.println(a);                      // 125
        System.out.println(++a);                    // 126
        System.out.println(a);                      // 126
        a = a-- - --a;                              // 126 = 126 - 124
        System.out.println(a);                      // 2              // 126 = 126 - 124
        a = --a - a--;                              // 126 = 125 - 126
        System.out.println(a);                      // 0


        int b = 8;
        // 1000 - 8 в битах
        System.out.println(b << 1);                 // 16
        // 100 <- сдвинет влево и добавит 0

        b = 18;
        // 10010
        System.out.println(b >> 1);                 // 9
        // 1001


        a = 5;
        b = 2;
        System.out.println(a | b);                  // 7
        // 101  - 5
        // 010  - 2
        // |    - или
        // 111  - 7

        boolean c = true;
        boolean d = false;
        System.out.println(c & d);                  // false

        String f = "qwer1y";
        boolean g = f.length() >= 5 && f.charAt(4) == '1';
        System.out.println(g);                      // true


        int[][] arr = new int[3][5];                // 3 строки и 5 столбцов
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();


        System.out.println();
        int q = 1, w = 2;
        int r = q + w;
        String result = String.format("%d + %d = %d \n", q, w, r);
        System.out.printf("%d + %d = %d \n", q, w, r);
        System.out.println(result);


        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
            System.out.print(count);
        }
        System.out.println();

        value = 321;
        count = 0;
        do {
            value /= 10;
            count++;
            System.out.print(count);
        } while (value != 0);


        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        for (int item : arr1) {
            System.out.print(item);
        }
    }

    static String getType(Object p) {
        return p.getClass().getSimpleName();
    }
}
