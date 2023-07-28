package Home_works.Seminar_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class Task_03 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            arr = new Integer[]{10, 20, 30, 40, 50};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        analyzeNumbers(arr);
    }

    public static void analyzeNumbers(Integer[] array) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));    // заполняем список значениями из массива
        list.sort(Comparator.naturalOrder());                               // сортируем список
        int maxNumber = list.get(list.size() - 1);
        int minNumber = list.get(0);
        int sumItem = 0;

        for (int item : list) {
            sumItem += item;
        }
        int average = sumItem / list.size();


        System.out.println(list);
        System.out.println("Minimum is " + minNumber);
        System.out.println("Maximum is " + maxNumber);
        System.out.println("Average is = " + average);
    }
}
