package Seminars.Seminar_01;

import java.math.BigInteger;
import java.util.Scanner;

/*===========================================================
* Задание №6 (доп)
* Реализовать функцию возведения числа а в степень b. a, b из Z.
* Сводя количество выполняемых действий к минимуму.
* Пример 1: а = 3, b = 2, ответ: 9
* Пример 2: а = 2, b = -2, ответ: 0.25
* Пример 3: а = 3, b = 0, ответ: 1
===========================================================*/
public class Task_06 {
    public static void main(String[] args) {

        int value, power;
        Scanner in = new Scanner(System.in);
        System.out.print("Input value => ");
        value = in.nextInt();
        System.out.print("Input power => ");
        power = in.nextInt();
        in.close();

        int resultTest1 = (int) Math.pow(value, power);   // вариант через pow
        int resultTest2 = powRecurs(value, power);        // вариант рекурсии
        double resultTest3= power(value, power);          // вариант при отрицательной степени
        System.out.printf("Example 1: a = %d, b = %d, answer: %d (Math.pow)\n", value, power, resultTest1);
        System.out.printf("Example 1: a = %d, b = %d, answer: %d (recursive)\n", value, power, resultTest2);
        System.out.printf("Example 1: a = %d, b = %d, answer: %.2f (cycle)\n", value, power, resultTest3);

    }

    public static int powRecurs(int value, int degree) {
        if (degree <= 0) return 1;
        else return value * (powRecurs(value, degree - 1));
    }

    public static double power(int value, int power) {
        double new_value = power < 0 ? 1.0 / value : value; // если степень отрицательная, то делим число на 1,0
        double result = 1.0;
        for (int i = 0; i < Math.abs(power); i++) {
            result *= new_value;
        }
        return result;
    }

}

