package Seminars.Seminar_03;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Ex_01 {
    public static void main(String[] args) {
        int[] array1 = IntStream.rangeClosed(1, 10).toArray();
        System.out.println(Arrays.toString(array1));    // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        List<Integer> ints = IntStream.rangeClosed(1, 10).boxed().toList();
        System.out.println(ints);                       // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        int[] array2 = IntStream.generate(() -> ThreadLocalRandom.current().nextInt(20))
                .limit(10)
                .toArray();
        System.out.println(Arrays.toString(array2));    // [10, 15, 1, 8, 1, 13, 6, 5, 18, 2]
    }
}
