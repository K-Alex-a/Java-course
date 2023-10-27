package Seminars.Seminar_02;

import java.io.FileReader;
import java.io.IOException;
/*===============================
* Чтение файла и вывод в консоль.
===============================*/
public class Ex05_fileReader {
    public static void main(String[] args) {
        FileReader reader;
        String text = "";
        try {
            reader = new FileReader("text.txt");
            while (reader.ready()) {
                text += (char) reader.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
            System.out.println(text);
    }
}
