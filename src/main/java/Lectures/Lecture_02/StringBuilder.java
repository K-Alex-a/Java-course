package Lectures.Lecture_02;

public class StringBuilder {
    public static void main(String[] args) {

        // Через обычный цикл (54ms)
        String str = "";
        for (int i = 0; i < 1000000; i++) {
            str += "+";
        }

        var s = System.currentTimeMillis();
        // Через StringBuilder (8ms)
        java.lang.StringBuilder sb;
        sb = new java.lang.StringBuilder();
        sb.append("+".repeat(1_000_000));
        System.out.println(System.currentTimeMillis() - s);

    }
}
