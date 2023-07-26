package Seminars.Seminar_01;

import java.util.Arrays;

/*===========================================================
* Задание №5 (доп)
* Во фразе "Добро пожаловать на курс по Java" переставить слова
* в обратном порядке.
===========================================================*/
public class Task_05 {
    public static void main(String[] args) {
        String phrase = "Добро пожаловать на курс по Java !";

        StringBuilder reverse_letters = new StringBuilder(phrase).reverse(); // переворачивает посимвольно
        System.out.println(reverse_letters);

        String[] arrayPhrase = phrase.split(" ");               // перводим строку в массив строк
        int length = (arrayPhrase.length / 2) + 1;              // режем длинну массива, чтобы менять текущий с начала и текущий с конца
        int end_index = arrayPhrase.length - 1;                 // задаем инлекс с конца


        for (int i = 0; i < length; i++, end_index--) {         // пока текущий индекс меньше половины массива
            String temp = arrayPhrase[i];                       // перезаписываем жлемент с конца с тем что вначале
            arrayPhrase[i] = arrayPhrase[end_index];
            arrayPhrase[end_index] = temp;
        }
        System.out.println(Arrays.deepToString(arrayPhrase));

    }
}
