package Home_works.Additional_tasks;


import java.util.*;
/*===========================================
* Вывести список на экран в перевернутом виде
* (без массивов и ArrayList).
* Пример: 1 -> 2 -> 3 -> 4
* Вывод:  4 -> 3 -> 2 -> 1
===========================================*/
public class Task_03 {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(5);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println(nums);
        printList((LinkedHashSet<Integer>) reversSet(nums));
    }

    public static Set<Integer> reversSet(HashSet<Integer> nums) {
        TreeSet<Integer> sortedNums = new TreeSet<>(nums);
        int length = sortedNums.size();
        Set<Integer> newSetNums = new LinkedHashSet<>(length);
        for (int i = 0; i < length; i++) {
            newSetNums.add(sortedNums.pollLast());
        }
        return newSetNums;
    }

    public static void printList(LinkedHashSet<Integer> nums) {
        Iterator<Integer> it = nums.iterator();
        for (int i = 0; i < nums.size(); i++) {
            if (i == nums.size()-1) {
                System.out.print(it.next());
            } else {
                System.out.print(it.next() + " -> ");
            }
        }
    }

}
