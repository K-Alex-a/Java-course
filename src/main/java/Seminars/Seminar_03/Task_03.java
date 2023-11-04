package Seminars.Seminar_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*==================================
* Удалить из списка строк строки, которые могут быть целыми числами.
* Прмиер: "first", "1", "second", "-2", "third", "3", "4"
*         "first", "second", "third"
==================================*/
public class Task_03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("first", "1", "second", "-2", "third", "3", "4"));
        removeInteger(list);
    }

    public static void removeInteger(ArrayList<String> list) {
        list.removeIf(element -> isInteger(element));
        System.out.println(list);

//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String element = iterator.next();
//            if (isInteger(element)) {
//                iterator.remove();
//            }
//        }
    }

    private static boolean isInteger(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
//        return string.matches("[-]{0,1}\\d+");
    }
}
