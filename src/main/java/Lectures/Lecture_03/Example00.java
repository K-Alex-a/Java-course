package Lectures.Lecture_03;

public class Example00 {
    public static void main(String[] args) {
        Object object = 1;
        getType(object);     // java.lang.Integer
        object = 1.2;
        getType(object);     // java.lang.Double
    }

    static void getType(Object object) {
        System.out.println(object.getClass().getName());    // выводит тип переменной
    }

}
