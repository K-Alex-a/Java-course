package Seminars.Seminar_02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*====================================
Дана последовательность из N чисел.
Найти сумму чисел, оканчивающуюся на 5,
перед которыми идет четное число
====================================*/
public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length string: ");
        int lengthString = scanner.nextInt();

        String[] numbers = numbersBuilder(lengthString);
        System.out.println(Arrays.toString(numbers));
        System.out.printf("Number of fives after even numbers: %d", numberOfDigit(numbers));

        scanner.close();

    }

    public static String[] numbersBuilder(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int number = rand.nextInt(6);
            stringBuilder.append(number);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().split(" ");
    }


    public static Integer numberOfDigit(String[] numbers) {
        int count = 0;
        for (int i = 1; i < numbers.length; i++) {
            int i1 = Integer.parseInt(numbers[i]);
            int i2 = Integer.parseInt(numbers[i - 1]);
            if (i1 % 10 == 5 && i2 % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
