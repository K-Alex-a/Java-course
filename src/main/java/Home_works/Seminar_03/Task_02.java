package Home_works.Seminar_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*=========================================================================================
 * Удаление четных элементов
 * Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел,
 * удаляла бы из него четные числа и выводила список без четных чисел.
 * Напишите свой код в методе removeEvenNumbers класса Answer.
 * Метод removeEvenNumbers принимает на вход один параметр:
 * Integer[] arr - список целых чисел
 * Пример:
 * Пример:
 * Вход: 1, 2, 3, 4, 5, 6, 7, 8, 9
 * Выход: 1, 3, 5, 7, 9
 *=========================================================================================*/

public class Task_02 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }
        answer(arr);
    }

    public static void answer(Integer[] array) {
        List<Integer> newArray = new ArrayList<>();
        for (int item : array) {
            if (array[item] % 2 != 0) newArray.add(array[item]);
        }
        System.out.println(newArray);
    }
}
