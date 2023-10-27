package Lectures.Lecture_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class Tests {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        list.add(1000);
        list.add(10000);
        list.add(100000);
        System.out.println(list);

        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(3) = " + list.get(3));
        System.out.println(list);

        System.out.println("list.indexOf(100) = " + list.indexOf(100));
        System.out.println("list.lastIndexOf(1000) = " + list.lastIndexOf(1000));

        System.out.println("list.remove(1) = " + list.remove(1));
        System.out.println(list);
        System.out.println("list.add(100) = " + list.add(100));
        System.out.println(list);

        System.out.println("list.set(6, 20) = " + list.set(4, 20));
        System.out.println(list);

        list.sort(Integer::compareTo);
        System.out.println(list);

        System.out.println("list.subList(2, 4) = " + list.subList(2, 4));

        list.clear();
        System.out.println("list.clear() = " + list);

        list.add(10);
        list.add(100);
        list.add(1000);
        list.add(10000);
        list.add(100000);
        System.out.println(list);

        System.out.println("list.toString() = " + list.toString());

//        int[] array = new int[] {10, 20, 30, 40, 50};
//        Arrays.asList(array); // как работает?
//        System.out.println(array);

        Collection<Integer> objects = new ArrayList<>();
        objects.add(10);
        objects.add(101);
        System.out.println("list.contains(1000) = " + list.containsAll(objects));
        System.out.println("list.contains(1000) = " + list.contains(1001));

        System.out.println("list.removeAll(objects) = " + list.removeAll(objects));
        System.out.println(list);

        System.out.println("list.toArray() = " + Arrays.toString(list.toArray()));
//        System.out.println("list.toArray() = " + Arrays.toString(list.toArray(double)));  // как работает?

        ArrayList<Integer> list2 = new ArrayList<>(List.copyOf(list));
        list2.add(5000000);
        System.out.println("list2 = " + list2);




    }
}
