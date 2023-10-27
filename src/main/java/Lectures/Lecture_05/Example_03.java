package Lectures.Lecture_05;
import java.util.TreeMap;
/*=========
* TreeMap
=========*/
public class Example_03 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1, "one");
        tMap.put(6, "six");
        tMap.put(4, "four");
        tMap.put(3, "three");
        tMap.put(2, "two");
        System.out.println(tMap);                       // {1=one, 2=two, 3=three, 4=four, 6=six}

        System.out.println(tMap.descendingKeySet());    // [6, 4, 3, 2, 1]
        System.out.println(tMap.descendingMap());       // {6=six, 4=four, 3=three, 2=two, 1=one}
        System.out.println(tMap.tailMap(4));            // {4=four, 6=six}
        System.out.println(tMap.headMap(4));            // {1=one, 2=two, 3=three}
        System.out.println(tMap.lastEntry());           // 6=six
        System.out.println(tMap.firstEntry());          // 1=one
    }
}
