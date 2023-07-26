package Seminars.Seminar_01;

/*=======================================================
* Задание №1
* Написать программу, которая запросит пользователя ввести
* <Имя> в консоли.
* Получит введенную строку и выведет в консоль сообщение
* “Привет, <Имя>!”
* +
* В консоли запросить имя пользователя. В зависимости от
* текущего времени, вывести приветствие вида
* "Доброе утро, <Имя>!", если время от 05:00 до 11:59
* "Добрый день, <Имя>!", если время от 12:00 до 17:59;
* "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
* "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
=======================================================*/
import java.time.LocalTime;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = in.nextLine();
        in.close();

        System.out.println();
        System.out.println("Hello, " + name + "!");
        time(name);


    }

    public static void time(String name) {
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(5, 0)) && time.isBefore(LocalTime.of(11, 59))) {
            System.out.println("Good morning, " + name + "!");
        } else if (time.isAfter(LocalTime.of(12, 0)) && time.isBefore(LocalTime.of(17, 59))) {
            System.out.println("Good afternoon, " + name + "!");
        } else if (time.isAfter(LocalTime.of(18, 0)) && time.isBefore(LocalTime.of(22, 59))) {
            System.out.println("Good evening, " + name + "!");
        }else if (time.isAfter(LocalTime.of(23, 0)) && time.isBefore(LocalTime.of(4, 59))) {
            System.out.println("Good night, " + name + "!");
        }
    }
}
