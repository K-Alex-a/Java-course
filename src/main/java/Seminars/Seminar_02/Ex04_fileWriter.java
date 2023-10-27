package Seminars.Seminar_02;

import java.io.FileWriter;
import java.io.IOException;
/*============
* Запись файла
============*/
public class Ex04_fileWriter {
    public static void main(String[] args) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("text.txt");
            fileWriter.append("Привет мир!");
            fileWriter.flush();     // проводит нить до файла, занимая его действием

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
