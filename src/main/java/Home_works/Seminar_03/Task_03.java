package Home_works.Seminar_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/*==========================================================================================
* Анализатор списка
* Напишите функцию analyzeNumbers,
* которая принимает на вход целочисленный список arr и:
* Сортирует его по возрастанию и выводит на экран
* Находит минимальное значение в списке и выводит на экран - Minimum is {число}
* Находит максимальное значение в списке и выводит на экран - Maximum is {число}
* Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
* Напишите свой код в методе analyzeNumbers класса Answer.
* Метод analyzeNumbers принимает на вход один параметр:
* Integer[] arr - список целых чисел
* Пример
* arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
* analyzeNumbers(arr)
* // [1, 2, 3, 4, 5, 6, 7, 8, 9]
* // Minimum is 1
* // Maximum is 9
* // Average is = 5
==========================================================================================*/

public class Task_03 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            arr = new Integer[]{10, 20, 30, 40, 50};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        analyzeNumbers(arr);
    }

    public static void analyzeNumbers(Integer[] array) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));    // заполняем список значениями из массива
        list.sort(Comparator.naturalOrder());                               // сортируем список
        int maxNumber = list.get(list.size() - 1);
        int minNumber = list.get(0);
        int sumItem = 0;

        for (int item : list) {
            sumItem += item;
        }
        int average = sumItem / list.size();


        System.out.println(list);
        System.out.println("Minimum is " + minNumber);
        System.out.println("Maximum is " + maxNumber);
        System.out.println("Average is = " + average);
    }
}
