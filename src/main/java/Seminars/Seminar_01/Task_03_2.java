package Seminars.Seminar_01;

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
public class Task_03_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 3, 2, 2, 3};
        int val = 3;
        int start = 0;
        int end = arr[arr.length - 1];

        for (int j : arr) {
            System.out.print(j + " ");
        }
        while (start < end) {
            if (arr[start] == val) {
                if (arr[end] != val) {
                    arr[start] = arr[end];
                    arr[end] = val;
                } else {
                    end--;
                }
            } else {
                start++;
            }
        }
        System.out.println(" ");

        for (int j : arr) {
            System.out.print(j + " ");


        }
    }
}
