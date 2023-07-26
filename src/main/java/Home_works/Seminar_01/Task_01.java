package Home_works.Seminar_01;

import java.util.Random;

/*==================================================================
* N-ое треугольное число
* Вычислить n-ое треугольного число(сумма чисел от 1 до n),
* n! (произведение чисел от 1 до n).
* Внутри класса Answer напишите метод countNTriangle,
* который принимает число n и возвращает его n-ое треугольное число.
* Пример
* n = 4 -> 10
* n = 5 -> 15
==================================================================*/
public class Task_01 {
    public static void main(String[] args) {
        int number = 4;
        System.out.println(number + " = " + countTriangle(number));
    }
    public static int countTriangle(int n) {
        if (n < 0) return 0;
        else return n + countTriangle(n-1);
    }
}
