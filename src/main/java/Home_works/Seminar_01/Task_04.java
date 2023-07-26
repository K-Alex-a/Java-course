package Home_works.Seminar_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*==========================================================================
* В файле задано уравнение вида q + w = e (q, w, e >= 0).
* Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
* Восстановите выражение до верного равенства.
* Предложите хотя бы одно решение или сообщите, что его нет.
* Напишите класс Equation, содержащий метод getSolution, который будет
* считывать уравнение из файла и восстановит его до верного равенства.
* Выведите сначала строку формата "Given the equation: {выражение из файла}".
* А затем верните строку формата "Result: {цельное выражение}".
* Если выражение не имеет решений - верните строку "No solution".
* Пример
* Given the equation: ? + 4 = 9
* Result: 5 + 4 = 9
==========================================================================*/
public class Task_04 {
    public static void main(String[] args) {
        String str = getReader();
        getSolution(str);


    }


    public static void getSolution(String str) {

        System.out.println();
        String[] newString = str.split(" *[+=] *");
        String a = newString[0];
        String b = newString[1];
        String c = newString[2];

        String result = "";

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                String a1 = a.replace('?', (char) ('0' + i));
                String b1 = b.replace('?', (char) ('0' + i));
                String c1 = c.replace('?', (char) ('0' + i));
                if (Integer.parseInt(a1) + Integer.parseInt(b1) == Integer.parseInt(c1)) {
                    result = a1 + " + " + b1 + " = " + c1;
                }
            }
        }
        if (result.equals("")) {
            System.out.println("Not solution");
            ;
        } else {
            System.out.printf("Result: %s", result);
        }
    }


    public static String getReader() {    // считываем строку
        String result = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                result = line;
                System.out.println(result);
                line = reader.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
