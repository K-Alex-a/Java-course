package Lectures.Lecture_03;

import java.util.Arrays;
import java.util.List;

public class Example05 {
    public static void main(String[] args) {
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = new StringBuilder[]{day, month, year};
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d);              // [28, 9, 1990]
        date[1] = new StringBuilder("09");  // добавлаем на индекс 1 новое значение
        System.out.println(d);              // [28, 09, 1990]

    }
}
