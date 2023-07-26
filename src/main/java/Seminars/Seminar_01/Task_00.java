package Seminars.Seminar_01;
/*==============================================================
* Скачать и установить: https://code.visualstudio.com/download
* Настроить проект, вывести в консоль “Hello world!”.
* Вывести в консоль системные дату и время.
==============================================================*/

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

public class Task_00 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Date date = Date.from(Instant.now());
        System.out.println(date);

        System.out.println(LocalDateTime.now());
    }
}
