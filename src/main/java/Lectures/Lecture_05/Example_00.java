package Lectures.Lecture_05;

import java.util.HashMap;
import java.util.Map;

public class Example_00 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "one");
        db.put(2, "two");
        db.put(null, "!null");
        System.out.println(db);                         // {null=!null, 1=one, 2=two}
        System.out.println(db.get(44));                 // null
        System.out.println(db);                         // {null=!null, 1=one, 2=two}
        System.out.println(db.containsValue("one"));    // true
        System.out.println(db.containsKey(1));          // true
        System.out.println(db.keySet());                // [null, 1, 2]
        System.out.println(db.values());                // [!null, one, two]

    }
}
