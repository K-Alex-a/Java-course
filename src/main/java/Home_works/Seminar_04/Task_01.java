package Home_works.Seminar_04;

import java.util.LinkedList;

/*==============================================
* Перевернутый LinkedList
* Пусть дан LinkedList с несколькими элементами.
* Напишите класс LLTasks с методом revert,
* который принимал бы на вход LinkedList и
* возвращает “перевернутый” список.
* Пример
* // Дан:   [1, One, 2, Two]
* // Вывод: [1, One, 2, Two]
*           [Two, 2, One, 1]
==============================================*/
public class Task_01 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length != 4) {
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        System.out.println(ll);
        LinkedList<Object> reversedList = revert(ll);
        System.out.println(reversedList);
    }


    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        int length = ll.size();
        LinkedList<Object> llRevert = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            llRevert.add(ll.getLast());
            ll.removeLast();
        }
        return llRevert;
    }
}

