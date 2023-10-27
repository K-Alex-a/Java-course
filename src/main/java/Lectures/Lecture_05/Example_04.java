package Lectures.Lecture_05;

import java.util.LinkedHashMap;
import java.util.Map;

public class Example_04 {
    public static void main(String[] args) {
        Map<Integer, String> linkMap = new LinkedHashMap<>();
        linkMap.put(11, "one one");
        linkMap.put(1, "one");
        linkMap.put(2, "two");
        System.out.println(linkMap);    // {11=one one, 1=one, 2=two}

    }
}
