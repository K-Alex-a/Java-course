package Seminars.Seminar_03;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/*================================================
* Создать 2 списка: один из слов, второй из чисел.
* Вывести оба списка в консоль.
* Удалить из стрингового списка все слова,
* длина которых меньше, чем число во втором списке
* на одном и том же индексе.
================================================*/
public class Task_04 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        words.add("лево");
        words.add("право");
        words.add("клевер");
        words.add("лен");
        words.add("параграф");
        words.add("дерево");
        words.add("лес");
        System.out.println(words);

        for (int i = 0; i < words.size(); i++) {
            numbers.add(randomNumber());
        }
        System.out.println(numbers);
        System.out.println();

        for (int i = 0; i < words.size(); i++) {
            int lengthWord = words.get(i).length();
            int number = numbers.get(i);
            if ( lengthWord < number) {
                words.remove(i);
                numbers.remove(i);
                i--;
            }
        }
        System.out.println("Result: " + words);
    }

    public static int randomNumber() {
        return ThreadLocalRandom.current().nextInt(10);
    }
}
