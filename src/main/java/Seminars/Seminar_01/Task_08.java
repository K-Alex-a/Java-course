package Seminars.Seminar_01;

import java.util.Arrays;

/*=============================================================
* Задание №8 (доп)
* Дан массив целых чисел, упорядоченный строго по возрастанию.
* Дано некоторое число X, нужно менее чем за квадратное количество
* операций(то есть перебор всех пар) найти такие два любых элемента
* массива, что их сумма равна X, иначе вывести 0.
=============================================================*/
public class Task_08 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 10, 5, 6, 25, 18, 20};
        int x = 28;
        Arrays.sort(nums);

        System.out.printf("Sum of two numbers: %d \n", x);
        System.out.println("Array to check: " + Arrays.toString(nums));

        System.out.println(searchSumNum(nums, x));

    }

    public static boolean searchSumNum(int[] array, int value) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] + array[i - 1] == value) return true;
        }
        return false;
    }


}
