package Lectures.Lecture_02;

import java.io.File;

public class FileWork {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");    // прописываем путь папки с которой запускается проект. Вернет D:\00_Studies\01_Quarter\05. _____(Java_coorse)\Java_coorse
        String pathFile = pathProject.concat("/file.txt");      // указываем конкретный файл
        File name_file = new File(pathFile);                    // создает файл
        System.out.println(name_file.getAbsolutePath());        // щы\\запускаем создание?
    }
}
