package Lectures.Lecture_03;

public class Example01 {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));      // 3
        System.out.println(sum(1.0, 2));    // 0
        System.out.println(sum(1, 2.0));    // 0
        System.out.println(sum(1.2, 2.1));  // 3.3
    }

    static Object sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else return 0;
    }
}
