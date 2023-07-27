package Lectures.Lecture_03;

import java.util.List;

public class Example06 {
    public static void main(String[] args) {
        Character value = null;
        List<Character> list1 = List.of('C', 'r', 'e', 'a', 't', 'e');
        // удалить элементы отсюда уже не получится, т.к. List.of - неизменяемый
        System.out.println(list1);                      // [C, r, e, a, t, e]
        List<Character> list2 = List.copyOf(list1);     // копируем в новый лист предыдущий лист
        System.out.println(list2);                      // [C, r, e, a, t, e]
    }
}
