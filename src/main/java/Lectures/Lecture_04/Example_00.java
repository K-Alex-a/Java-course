package Lectures.Lecture_04;
import java.util.PriorityQueue;

public class Example_00 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);         // [1, 3, 13, 123]

        System.out.println(pq.poll());  // 1
        System.out.println(pq.poll());  // 3
        System.out.println(pq.poll());  // 13
        System.out.println(pq);         // 1233
    }
}
