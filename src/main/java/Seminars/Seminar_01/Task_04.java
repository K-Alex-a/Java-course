package Seminars.Seminar_01;

/*========================================================
* Задание №4
* Напишите метод, который находит самую длинную строку общего
* префикса среди массива строк.
* Если общего префикса нет, вернуть пустую строку "".
* Input: ["flower","flow","flight"]
* Output: "fl"
* String names = …
* String[] words = names .split(“ “)
========================================================*/
public class Task_04 {
    public static void main(String[] args) {
        String[] words_test0 = {"flower", "flow", "flight", "compare", "blossom", "flight", "floret", "butterfly"};
        String[] words_test1 = {"compare", "blossom"};
        String[] words_test2 = {"flower", "flow", "flight", "compare", "blossom", "flight", "floret"};
        String check_str = "fl";


        System.out.println(foundChar(words_test0, check_str));
        System.out.println(foundChar(words_test1, check_str));
        System.out.println(foundChar(words_test2, check_str));

    }

    public static String foundChar(String[] _words, String _char) {
        String currentWord = "";
        int currentLength = 0;

        for (String item : _words) {
            int itemLength = item.length();
            if (item.contains(_char)) {
                if (currentLength <= itemLength) {
                    currentWord = item;
                    currentLength = itemLength;
                } else {
                    currentLength = 0;
                }
            }
        }
        return currentWord;
    }
}
