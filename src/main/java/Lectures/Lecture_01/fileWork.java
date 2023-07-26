package Lectures.Lecture_01;

import java.io.*;

public class fileWork {
    public static void main(String[] args) throws Exception {
        try (FileWriter fw = new FileWriter("file.txt", false)){
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.append('\n');
            fw.write("line 4");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }



//        FileReader fr = new FileReader("file.txt");
//        int k;
//        while ((k = fr.read()) != -1) {
//            char cha = (char) k;
//            if (cha == '\n') {
//                System.out.println(cha);
//            } else {
//                System.out.println(cha);
//            }
//
//    }
//        BufferedReader br = new BufferedReader((new FileReader("file.txt")));
//        String str;
//        while ((str = br.readLine()) != null) {
//            System.out.println("== %s ==\n", str);
//        }
//        br.close();

}}

