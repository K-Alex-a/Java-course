package Seminars.Seminar_04.revers;

public class Main {
    public static void main(String[] args) {
        ListNode list = new ListNode();


    }
    public static ListNode reverseList(ListNode head) {
        ListNode x = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next;
            current.next = x;
            x = current;
            current = temp;
        }
        return x;
    }
}
