package Seminars.Seminar_05;
import java.util.HashMap;
import java.util.Map;
/*===========================================
* Проверить что 2 строки являются изоморфными
* abc, abc -> true
* abc, bce -> true
* paper, title -> true
* foo, baf -> false
* add, egg -> true
* note, code -> true
* abcde, aaaaa -> true
* aaaaa, abcde -> false
===========================================*/
public class Task_2 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("abc", "abc"));
        System.out.println(isIsomorphic("abc", "bce"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("foo", "baf"));
        System.out.println(isIsomorphic("add", "egg"));
        System.out.println(isIsomorphic("note", "code"));
        System.out.println(isIsomorphic("abcde", "aaaaa"));
        System.out.println(isIsomorphic("aaaaa", "abcde"));
    }

    public static boolean isIsomorphic(String first, String second){
        Map<Character, Character> mapping = new HashMap<>();

        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();
        if (firstChars.length != secondChars.length) {
            return false;
        }

        for (int i = 0; i < firstChars.length; i++) {
            char firstChar = firstChars[i];
            char secondChar = secondChars[i];

            if (mapping.containsKey(firstChar)){
                Character prevChar = mapping.get(firstChar);
                if (prevChar != secondChar) {
                    return false;
                }
            } else {
                mapping.put(firstChar, secondChar);
            }
        }
        return true;
    }
}
