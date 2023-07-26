package Seminars.Seminar_01;

import java.util.Arrays;
import java.util.Random;

/*==========================================================
* Задание №3
* Дан массив nums = [3,2,1,2,3] и число val = 3.
* Если в массиве есть числа, равные заданному, нужно перенести
* эти элементы в конец массива.
* Таким образом, первые несколько (или все) элементов массива
* должны быть отличны от заданного, а остальные - равны ему.
* [2,2,1,3,3]
* [2,1,2,3,3]
==========================================================*/
// My version:
public class Task_03_3 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int value = 0;
        fillMatrix(nums);
        System.out.println("Before: " + Arrays.toString(nums));
        System.out.println("After:  " + Arrays.toString(endElement(nums, value)));
    }

    public static int[] endElement(int[] array, int value) {
        int temp;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[length - 1] == value) {
                length--;
            } else {
                if (value == array[i]) {
                    temp = array[length - 1];
                    array[length - 1] = array[i];
                    array[i] = temp;
                    length--;
                }
            }
        }
        return array;
    }

    public static void fillMatrix(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(5);
        }
    }
}