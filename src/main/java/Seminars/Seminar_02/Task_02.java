package Seminars.Seminar_02;

import java.util.Scanner;
/*=================================================
Реализовать метод, принимающий строку и проверяющий,
является ли она палиндромом
 =================================================*/
public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = scanner.nextLine();

        System.out.println(
                palindrome(
                        deleteSpaces(
                                lowerString(text))));

    }

    public static String deleteSpaces(String string) {
        return string.replaceAll(" ", "");
    }

    public static String lowerString(String string) {
        return string.toLowerCase();
    }

    public static boolean palindrome(String string) {
        boolean result = true;
        int length = string.length() - 1;
        for (int i = 0; i < string.length() / 2; i++) {
            result = (string.charAt(i) == string.charAt(length - i));
        }
        return result;
    }
}
