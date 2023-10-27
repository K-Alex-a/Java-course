package Seminars.Seminar_02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) throws IOException {
        Path dir = Path.of("root", "dir");
        if (Files.notExists(dir)) {
            Files.createDirectories(dir);
        }

        Path file = Path.of("root", "dir", "file.txt");
        if (Files.notExists(file)) {
            Files.createFile(file);
        }
//        Files.delete(file);   // удаляет файл

        Files.writeString(file, "content");     // перезаписывает
        Files.writeString(file, "content", StandardOpenOption.APPEND);   // добавляет в конец файла

        String content = Files.readString(file);    // contentcontent
        System.out.println(content);

        String contentTwo = "asdsfgdb";             // asdsfgdb
        byte[] bytes = contentTwo.getBytes();       // в круглые скобы добавляется расширении, при не соответствии которого читабельность может быть утеряна
        Files.write(file, bytes);

        String readAll = Arrays.toString(Files.readAllBytes(file));     // [97, 115, 100, 115, 102, 103, 100, 98]

        System.out.println(readAll);



    }
}
