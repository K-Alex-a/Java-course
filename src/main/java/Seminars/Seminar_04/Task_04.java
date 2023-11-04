package Seminars.Seminar_04;

import java.util.Arrays;
import java.util.LinkedList;

/*=============================================
* Построить однонаправленный список целых чисел.
* Удалить отрицательные элементы списка.
=============================================*/
public class Task_04 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(-1, 1, -2, -2, 2, 3, -3, -3, 3, -4, 4, -5, 5));

        System.out.println("removeNegativeNumbers(list) = " + removeNegativeNumbers(list));
    }

    public static LinkedList<Integer> removeNegativeNumbers(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}
