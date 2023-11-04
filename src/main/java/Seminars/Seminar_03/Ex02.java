package Seminars.Seminar_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        int a = 0;
        List<Object> list = new ArrayList<>();

        list.add(12);
        list.add("dh");
        list.add(new Random());

        if (list.get(0) instanceof Integer) {
            a = (int) list.get(0);
            System.out.println(a);
        }

        if (list.get(1) instanceof String) {
            System.out.println((String) list.get(1));
        }

        for (Object str : list) {
            System.out.println(str);
        }

        list.forEach(item -> System.out.println(item));
        list.forEach(System.out::println);


    }
}
