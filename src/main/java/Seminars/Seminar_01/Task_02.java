package Seminars.Seminar_01;

import java.util.Arrays;
import java.util.Random;

/*============================================================
* Задание №2
* Дан массив двоичных чисел, например [1,1,0,1,1,1,1], вывести
* максимальное количество подряд идущих 1.
* Найти максимальное количество подряд идущих одинаковых
* элементов массива. (постараться сделать с одним циклом)
============================================================*/
public class Task_02 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int value = 1;
        fillMatrix(array);
        int result = countingValues(array, value);

        System.out.println(Arrays.toString(array));
        System.out.println("Total '1' per line: " + result);
    }

    public static int countingValues(int[] array, int value) {
        int currentLength = 0;
        int resultLength = 0;

        for (int item : array) {
            if (item == value) {
                currentLength++;
                if (resultLength < currentLength) resultLength = currentLength;
            } else currentLength = 0;
        }
        return resultLength;
    }

    public static void fillMatrix(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(2);
        }
    }

}
