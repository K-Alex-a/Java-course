package Seminars.Seminar_02.vector;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(1, 2, 3);
        Vector vector2 = new Vector(2, 3, 4);
        System.out.println(vector);
        System.out.println("vector.vectorLength() = " + vector.vectorLength());
        System.out.println("vector.scalar(twoVector) = " + vector.scalar(vector2));
        System.out.println("vector.vectorPr(new Vector()) = " + vector.vectorPr(new Vector(5, 6, 7)));
        System.out.println("vector.vectorCos(new Vector()) = " + vector.vectorCos(new Vector()));
    }
}
