package Lectures.Lecture_03;

import java.util.Iterator;
import java.util.List;

public class Example07 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();
        System.out.println(col);                    // java.util.ImmutableCollections$ListItr@6acbcfc0

        while (col.hasNext()) {                     // пока есть следующий элемент,
            System.out.println(col.next());         // дай нам его
//            col.next();                             // Exception in thread "main" java.util....
//            col.remove();                           // Exception in thread "main" java.lang...
        }
    }
}
