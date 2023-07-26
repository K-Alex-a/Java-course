package Seminars.Seminar_01;

import java.util.Arrays;

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
public class Task_03_1 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 5, 1, 2, 4, 3, 5, 6, 3, 1, 3};
        int value = 3;
        int temp = 0;


        for (int item : nums) {
            if (item != value) {
                nums[temp++] = item;    // 'temp++' - сначала запишет, а потом увеличит temp на 1
                System.out.println(Arrays.toString(nums));
            }
        }
        System.out.println();

        for (int i = temp; i < nums.length; i++) {  // перезаписываем в конец столько значений, сколько найдено
            nums[i] = value;
            System.out.println(Arrays.toString(nums));
        }
        System.out.println();

        System.out.println(Arrays.toString(nums));
    }
}