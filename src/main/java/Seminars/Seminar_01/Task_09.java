package Seminars.Seminar_01;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*==============================
* Задание №9 (доп)
* Записать в файл следующие данные:
* Name Surname Age
* Kate Smith 20
* Paul Green 25
* Mike Black 23
==============================*/
public class Task_09 {
    public static void main(String[] args)  {
        try (FileWriter fw = new FileWriter("Task_09_(Seminar_01).txt", false)){
            fw.write("Name Surname Age");
            fw.append('\n');
            fw.append("Kate Smith 20");
            fw.append('\n');
            fw.write("Paul Green 25");
            fw.append('\n');
            fw.write("Mike Black 23");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
