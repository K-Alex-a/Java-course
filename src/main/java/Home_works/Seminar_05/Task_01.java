package Home_works.Seminar_05;
import java.util.*;
/*================================================================================
 * Дан текст. Нужно отсортировать слова по длине (по возрастанию)
 * и вывести статистику на экран.
 * Регистр слова не имеет значения. Формат вывода произвольный.
 * Программа-минимум:
 * 1. Слова, состоящие из дефисов, считаем одним словом.
 * Т.е. "каких-то" - одно слово из 8 символов.
 * 2. Точки и запятые не должны входить в статистику.
 * Доп. задание*:
 * Не включать дефис в длину слова. Т.е. "каких-то" - одно слово из 7 символов.
 * Пример:
 * Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того,
 * чтобы выполнить тестовое задание GB.
 * Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.
 * 1 -> [и, в]
 * 2 -> [он, из, gb, не]
 * 3 -> [мой, для]
 * 4 -> [слов, того, себе]
 * 5 -> [текст, нужен, чтобы, несет, набор]
================================================================================*/
public class Task_01 {
    public static void main(String[] args) {
        String text = "Это мой первый текст. Он состоит из каких-то тестовых слов " +
                "и нужен для того, чтобы выполнить тестовое задание GB. " +
                "Данный текст не несет в себе какого-либо смысла, " +
                "он просто содержит набор слов.";
        printResult(
                countCharacters(
                        removeDuplicate(
                                removeSymbols(text))));
    }

    public static String[] removeSymbols(String text) {
        text = text.toLowerCase();
        String charsToRemove = "-,.";
        for (char symbol : charsToRemove.toCharArray()) {
            text = text.replace(String.valueOf(symbol), "");
        }
        return text.split(" ");
    }
    public static String[] removeDuplicate(String[] text){
        Set<String> words = new LinkedHashSet<>(List.of(text));
        text = words.toArray(new String[0]);
        return text;
    }

    public static Map<Integer, List<String>> countCharacters(String[] text) {
        Map<Integer, List<String>> map = new TreeMap<>();

        for (String word : text) {
                if (map.containsKey(word.length())) {
                    map.get(word.length()).add(word);
                } else {
                    map.put(word.length(), new ArrayList<>());
                    map.get(word.length()).add(word);
                }
        }
        return map;
    }
    public static void printResult(Map<Integer, List<String>> text) {
        for (int key = 1; key < text.size(); key++) {
            System.out.println(key + " -> " + text.get(key));
        }
    }
}
