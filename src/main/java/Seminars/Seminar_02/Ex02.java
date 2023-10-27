package Seminars.Seminar_02;

import java.nio.file.Files;
import java.nio.file.Path;

public class Ex02 {
    public static void main(String[] args) {
        Path path = Path.of("src");

        boolean exists = Files.exists(path);            // true
        System.out.println(exists);

        boolean isFile = Files.isRegularFile(path);     // false
        boolean isDirectory = Files.isDirectory(path);  // true
        System.out.println(isFile);
        System.out.println(isDirectory);

        Path absolutPath = path.toAbsolutePath();       // D:\00_Studies\01_Quarter\05.______(Java_course)\Java_course\src
        System.out.println(absolutPath);

    }
}
