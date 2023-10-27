package Seminars.Seminar_02;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        String string = "abcdef";
        int length = string.length();    // длинна строки
        System.out.println(length);      // 6

        String upperCase = string.toUpperCase();    // ABCDEF
        System.out.println(upperCase);

        byte[] bytes = string.getBytes();           // UTF8 кодировка по умолчанию
        System.out.println(Arrays.toString(bytes)); // [97, 98, 99, 100, 101, 102]

        char c = string.charAt(string.length() - 1);    // f
        System.out.println(c);

        char[] charArray = string.toCharArray();
        System.out.println(charArray);              // abcdef

        System.out.println(string.contains("abc")); // true
        System.out.println(string.contains("abb")); // false

        int abc = string.indexOf("abc");
        int bce = string.indexOf("bce");
        System.out.println(abc);            // 0 - индекс с которого начинается подстрока
        System.out.println(bce);            // -1 - отсутствие такой подстроки

        String text = "abc drt lj  cdf   iln zs";
        String[] s = text.split("\\s++");   // одно или более вхождений
        System.out.println(Arrays.toString(s));     // [abc, drt, lj, cdf, iln, zs]

        String replace = text.replaceAll(" ", "-");
        System.out.println(replace);        // abc-drt-lj--cdf---iln-zs

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fsd fsdfsds sdfsdf fdfzzxc");
        stringBuilder.replace(0, 5, "-");   // -sdfsds sdfsdf fdfzzxc
        System.out.println(stringBuilder);


    }
}
