package Lectures.Lecture_03;

import java.util.ArrayList;
import java.util.List;

public class Example03 {
    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>();
        newList.add(2809);


        for (Object object : newList) {
            System.out.println(object);
        }
    }
}
