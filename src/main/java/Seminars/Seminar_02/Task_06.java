package Seminars.Seminar_02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*===================================================
* Текст в формате: ФИО + возраст + пол  (5-6 человек)
* Считать и разделить.
* Сощдать списки отдельно для: ФИО,
*                              возраста,
*                              пола
===================================================*/
public class Task_06 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("peoples.txt");
            writer.append("Иванов Сергей Петрович 41 лет мужской\n");
            writer.append("Синицина Ольга Васильевна 30 лет женский\n");
            writer.append("Шпиц Александра Ивановна 19 лет женский\n");
            writer.append("Григорьев Николай Андреевич 29 лет мужской\n");
            writer.append("Петров Денис Владимирович 35 лет мужской\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String text = "";
        try {
            FileReader reader = new FileReader("peoples.txt");
            while (reader.ready()) {
                text += (char) reader.read();
            }
            String[] parts = text.split("\n");


            ArrayList<String> lastname = new ArrayList<>();
            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> surname = new ArrayList<>();
            ArrayList<String> age = new ArrayList<>();
            ArrayList<String> gender = new ArrayList<>();

            for (int i = 0; i < parts.length; i++) {
                String[] parts2 = parts[i].split(" ");
                lastname.add(parts2[0]);
                name.add(parts2[1]);
                surname.add(parts2[2]);
                age.add(String.valueOf(Integer.parseInt(parts2[3])));
                gender.add(String.valueOf(!parts2[5].contains("у")));
            }

            System.out.println(lastname);
            System.out.println(name);
            System.out.println(surname);
            System.out.println(age);
            System.out.println(gender);
            System.out.println();

            for (int i = 0; i < name.size(); i++) {
                System.out.println(lastname.get(i) + " "
                        + name.get(i) + " "
                        + surname.get(i) + " "
                        +": " + age.get(i) + " year"
                        + ", " + gender.get(i));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
