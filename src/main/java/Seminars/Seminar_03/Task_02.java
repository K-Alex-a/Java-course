package Seminars.Seminar_03;

import java.util.ArrayList;
import java.util.Arrays;

/*==========================
*Удалить из списка дубликаты
* Пример: "1", "2", "2", "2", "3", "1", "2", "5", "4", "3"
*         "1", "2", "3", "5", "4"
==========================*/
public class Task_02 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("1", "2", "2", "2", "3", "1", "2", "5", "4", "3"));
        removeDuplicate(strings);
    }

    public static void removeDuplicate(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            String element = strings.get(i);
            for (int j = i + 1; j < strings.size(); j++) {
                String another = strings.get(j);
                if (element.equals(another)) {
                    strings.remove(j--);
                }
            }
        }
        System.out.println(strings);
    }
}
