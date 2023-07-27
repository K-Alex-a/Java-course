package Lectures.Lecture_03;

public class Example02 {
    public static void main(String[] args) {
//        int[] a = new int[]{1, 9};
//        int[] b = new int[3];
//        System.arraycopy(a, 0, b, 0, a.length);         // из массива a (нелувого эоемента) копируем в массив b (нулевого эоемента), и меняем длинну b
//
//        for (int i : a) System.out.printf("%d ", i);    // 1 9
//        System.out.println();
//        for (int j : b) System.out.printf("%d ", j);    // 1 9 0

        int[] a = new int[]{0, 9};
        for (int i: a) System.out.printf("%d ", i);     // 0 9
        a = addItem(a, 2);
        a = addItem(a, 3);
        System.out.println();
        for (int j: a) System.out.printf("%d ", j);     // 0 9 2 3

    }

    static int[] addItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
}
