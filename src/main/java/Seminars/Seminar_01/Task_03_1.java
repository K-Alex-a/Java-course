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
        int[] nums = new int[]{3, 2, 1, 2, 4, 3, 5, 6, 3, 1, 3};
        int value = 3;
        int temp = 0;


        for (int item : nums) {
            if (item != value) {
                nums[temp++] = item;
                System.out.println(Arrays.toString(nums));
            }
        }
        System.out.println();

        for (int i = temp; i < nums.length; i++) {
            nums[i] = value;
            System.out.println(Arrays.toString(nums));
        }
        System.out.println();

        System.out.println(Arrays.toString(nums));
    }
}


//    public static void InTheEnd(int[] array, int who) {
//        int j = 0;
//        int temp = 0;
//        for (int i = 0; i + j < array.length - 1; i++) {
//            if (array[i] == who) {
//                temp = array[i];
//                array[i] = array[array.length - 1 - j];
//                array[array.length - 1 - j] = temp;
//                j++;
//
//            }
//        }
//    }





//    private static void ex3() {
//        Random random = new Random();
//        int[] arr = new int[20];
//        final int VAL = 3;
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            arr[i] = random.nextInt(1, 6);
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            if (arr[right] == VAL) {
//                right--;
//            } else if(arr[left] == VAL) {
//                arr[left] = arr[right];
//                arr[right] = VAL;
//
//                right--;
//                left++;
//            } else if (arr[left] != VAL) {
//                left++;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//    }