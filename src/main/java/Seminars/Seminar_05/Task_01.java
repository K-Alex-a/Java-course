package Seminars.Seminar_05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*==========================================
* Вывести статистику повторений внутри списка
* "1", "2", "2", "4", "3", "1", "4", "5", "2"
* "1" -> 2
* "2" -> 3
* "3" -> 1
* "4" -> 2
* "5" -> 1
==========================================*/
public class Task_01 {
    public static void main(String[] args) {
        countAndPrint(List.of("1", "2", "2", "4", "3", "1", "4", "5", "2"));
    }

    public static void countAndPrint(List<String> values) {
        Map<String, Integer> stats = new HashMap<>();
        for (String value : values) {
            if (stats.containsKey(value)) {
                Integer oldValue = stats.get(value);
                stats.put(value, oldValue + 1);
            } else {
                stats.put(value, 1);
            }
        }
        System.out.println(stats);
    }
}
