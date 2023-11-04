package Seminars.Seminar_04;

import java.util.Arrays;
import java.util.LinkedList;

/*======================================
* Заменить не кратные 3 элемента списка,
* суммой нечетных чисел
======================================*/
public class Task_03 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 45, 12, 16, 9, 10));


        int sum = sumOddNumbers(list);
        System.out.println("sumOddNumbers(list) = " + sum);
        System.out.println("newChangeList(list, sumOddNumbers(list)) = " + newChangeList(list, sum));
    }

    /**
     * Вычисление суммы нечетных чисел в списке
     * @param list список
     * @return  сумма нечетных чисел
     */
    public static int sumOddNumbers(LinkedList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                sum += integer;
            }
        }
        return sum;
    }

    /**
     * Замена чисел не кратных "3" на другое значение
     * @param list список
     * @param sum целочисленное значение
     * @return  список после замены
     */
    public static LinkedList<Integer> newChangeList(LinkedList<Integer> list, int sum) {
//        for (Integer integer: list) {
//            if (integer % 3 != 0) {
//                integer = sum;
//            }
//        }

        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i) % 3 != 0) {
                list.set(i, sum);
            }
        }
        return  list;
    }
}
