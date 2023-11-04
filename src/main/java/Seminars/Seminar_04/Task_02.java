package Seminars.Seminar_04;

import java.util.Arrays;
import java.util.LinkedList;

/*========================================
* Построить односвязный список целых чисел.
* Найти сумму четных элементов списка.
========================================*/
public class Task_02 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 25, 31, 14, 52, 16));

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                sum += list.get(i);
            }
        }
        System.out.println(sum);
    }
}
