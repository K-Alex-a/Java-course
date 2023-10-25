package Seminars.Seminar_02;

import java.util.Arrays;
import java.util.Random;
import java.util.SortedSet;
/*======================================================
Дан массив целых чисел. Заменить отрицательные элементы
на сумму индексов двухзначных элементов массива.
======================================================*/

public class Task_05 {
    public static void main(String[] args) {
        int[] array = fillArray();
        System.out.println(Arrays.toString(array) + '\n');

        int sum = sumOfIndicesOfTwoDigitNumbers(array);
        System.out.println("Summa: " + sum + '\n');

        int[] newArray = replacingNegativeValuesWithSum(array, sum);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] fillArray() {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (201)) - 100;
        }
        return array;
    }

    public static int sumOfIndicesOfTwoDigitNumbers(int[] array) {
        int sum = 0;
        System.out.print("Indices: ");
        for (int i = 0; i < array.length; i++) {
            var length = String.valueOf(Math.abs(array[i])).length();
            if (length == 2) {
                sum += i;
                System.out.print(i + ", ");;
            }
        }
        return sum;
    }

    public static int[] replacingNegativeValuesWithSum(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = sum;
            }
        }
        return array;
    }
}
