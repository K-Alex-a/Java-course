package Home_works.Seminar_01;

/*==============================================================
* Вывести простые числа
* Напишите функцию printPrimeNums, которая выведет на экран все
* простые числа от 1 до 1000, каждое на новой строке.
* Напишите свой код в методе printPrimeNums класса Answer.
* Пример 1 2 3 5 7 11 ...
==============================================================*/
public class Task_02 {
    public static void main(String[] args) {
        printPrimeNums();

    }

    public static void printPrimeNums() {
        for (int i = 1; i < 1000; i++) {
        boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(i);
        }

    }
}
