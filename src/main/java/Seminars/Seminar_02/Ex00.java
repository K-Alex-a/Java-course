package Seminars.Seminar_02;

public class Ex00 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2);   // true, т.к. ссылку на одну и ту же ячейку памяти
        System.out.println(s1 == s3);   // false
        System.out.println(s3 == s4);   // false

        System.out.println(s1.equals(s2));  // true
        System.out.println(s1.equals(s3));  // true
        System.out.println(s3.equals(s4));  // true
    }
}
