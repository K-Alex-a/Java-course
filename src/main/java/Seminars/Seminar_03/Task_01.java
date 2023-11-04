package Seminars.Seminar_03;

import java.util.ArrayList;
import java.util.Arrays;

/*========================================================
* Вывести статистику повторений внутри списка:
*  "1", "2", "2", "4", "3", "1", "4", "5", "2"
*  "1" -> 2
*  "2" -> 3
*  "3" -> 1
*  "4" -> 2
*  "5" -> 1
 ========================================================*/
public class Task_01 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("1", "2", "2", "2", "3", "1", "2", "5", "4", "3"));
        countAndPrint(strings);
    }

    public static void countAndPrint(ArrayList<String> strings) {
        ArrayList<String> unique = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            String element = strings.get(i);
            if (unique.contains(element)) {     // unique.indexOf(element) >= 0
                continue;
            }
            int counter = 1;
            for (int j = i + 1; j < strings.size(); j++) {
                String another = strings.get(j);
                if (element.equals(another)) {
                    counter++;
                }
            }
            System.out.println(element + " -> " + counter);
            unique.add(element);
        }
    }
}
