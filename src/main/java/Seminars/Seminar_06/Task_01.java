package Seminars.Seminar_06;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*==============================================
* [1, 2, 2, 3, 4, 1, 1, 5, 10, 23]
* Посчитать количество уникальных эоементов,
* т.е. колтчество эоементов, которые встречаются
* только 1 раз.
==============================================*/
public class Task_01 {
    public static void main(String[] args) {
        System.out.println(uniqueCount(List.of(1, 2, 2, 3, 4, 1, 1, 5, 10, 23, 11)));
    }

    static int uniqueCount(Collection<Integer> ints) {
        Set<Integer> unique = new HashSet<>();
        Set<Integer> visited = new HashSet<>();

        for (Integer x : ints) {
            if (visited.add(x)) {
                unique.add(x);
            } else {
                unique.remove(x);
            }

//            if (visited.contains(x)) {
//                unique.remove(x);
//            } else {
//                unique.add(x);
//                visited.add(x);
//            }
        }
        return  unique.size();
    }
}
