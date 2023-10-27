package Seminars.Seminar_05;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*==============================================
* Поиск элемента где порядок по ключу нарущается
==============================================*/
public class Example_01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 1; i < 1_000_000; i++) {
            map.put(i, String.valueOf(i));
        }

        Set<Map.Entry<Integer, String>> pairs = map.entrySet();
        int counter = 1;
        for(Map.Entry<Integer, String> pair : pairs) {
            Integer key = pair.getKey();
            if (key != counter){
                System.out.println("Нарушен порядок для " + counter + "-го элемента");
                System.out.println("Должен быть ключ -> " + counter);
                System.out.println("А по факту -> " + key);
                break;
            }
            counter ++;
        }
    }
}
