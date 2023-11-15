package Home_works.Additional_tasks;

import java.util.Arrays;
/*==========================================================================
* Задано уравнение вида q + w = e, q, w, e >= 0.
* Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
* Требуется восстановить выражение до верного равенства. Предложить хотя бы
* одно решение или сообщить, что его нет.
* Пример: 24 и 45
*         24 + 45 = 69
*         n = 4
==========================================================================*/
public class Task_01 {
    public static void main(String[] args) {
        String equation_01 = "2? + ?5 = 69";    // 24, 45, n = 4, true
        String equation_02 = "?4 + 1? = 36";    // 25, 12, n = 2, true
        String equation_03 = "8? + ?9 = 100";   // 81, 19, n = 1, true
        String equation_04 = "5? + ?9 = 99";    // 50, 09, n = none, false
        String equation_05 = "5?1 + ?91 = 1252";    // 50, 09, n = 6, true

        printResult(equation_01, searchNumber(equation_01.split(" ")));
        printResult(equation_02, searchNumber(equation_02.split(" ")));
        printResult(equation_03, searchNumber(equation_03.split(" ")));
        printResult(equation_04, searchNumber(equation_04.split(" ")));
        printResult(equation_05, searchNumber(equation_05.split(" ")));
    }

    public static Integer searchNumber(String[] array) {
        int n = -1;
        for (int i = 0; i < 10; i++) {
            String m = String.valueOf(i);
            int q = Integer.parseInt(array[0].replace("?", m));
            int w = Integer.parseInt(array[2].replace("?", m));
            int e = Integer.parseInt(array[4]);

            if (q + w == e) {
                n = i;
            }
        }
        return n;
    }

    public static void printResult(String equation, int n) {
        if (n < 0) {
            System.out.println("equation: " + equation + ", n = none, false");
        } else {
            System.out.println("equation: " + equation + ", n = " + n +  ", true");
        }
    }

}
