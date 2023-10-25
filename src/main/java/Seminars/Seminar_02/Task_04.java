package Seminars.Seminar_02;

import java.util.Arrays;
import java.util.Random;

/*=========================================================
Дан массив целых чисел. Найти кол-во пар соседних элементов,
где первый элемент вдвое больше второго.
=========================================================*/
public class Task_04 {
    public static void main(String[] args) {
        int[] array = fillArray();
        System.out.println("Test 01: " + Arrays.toString(array));
        System.out.println("Double the number of pairs: " + numbersOfPairs(array) + '\n');

        int[] arrayTest01 = new int[] {10, 20, 5, 10, 20, 25, 50, 3, 9, 18};
        System.out.println("Test 02: " + Arrays.toString(arrayTest01));
        System.out.println("Double the number of pairs: " + numbersOfPairs(arrayTest01));

    }

    public static int[] fillArray() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static int numbersOfPairs(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length-1; i++) {
            int i1 = array[i];
            int i2 = array[i + 1];
            if (i2 / 2 == i1) {
                count++;
            }
        }
        return count;

    }
}
