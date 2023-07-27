package Lectures.Lecture_03;

import java.util.Arrays;
import java.util.List;

public class Example04 {
    public static void main(String[] args) {
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = {day, month, year};    // определение массива
        List<Integer> d = Arrays.asList(date);  // определение коллекуии из полученного массива
        System.out.println(d);                  // [29, 9, 1990]
    }
}
