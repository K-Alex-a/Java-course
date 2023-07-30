package Home_works.Seminar_02;

/*===============================================================================
Распарсить JSON
Внутри класса Answer напишите метод answer, который распарсит json и,
используя StringBuilder, создаст строки вида:
* Студент [фамилия] получил [оценка] по предмету [предмет].
* На вход метода answer подаются аргументы:
* String JSON
* String ELEMENT1
* String ELEMENT2
* String ELEMENT3
* Пример:
* JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
    "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
* ELEMENT1 = "Студент ";
* ELEMENT2 = " получил ";
* ELEMENT3 = " по предмету ";
* Выход:
* // Студент Иванов получил 5 по предмету Математика
* // Студент Петрова получил 4 по предмету Информатика
* // Студент Краснов получил 5 по предмету Физика
===============================================================================*/

public class Task_03 {
    public static void main(String[] args) {
        String ELEMENT1 = "Студент ";
        String ELEMENT2 = " получил ";
        String ELEMENT3 = " по предмету ";

        String JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        System.out.println(answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3)); // вариант через кейсы
//        answer2(JSON, ELEMENT1, ELEMENT2, ELEMENT3);                  // вариант через if-ы
    }

    public static StringBuilder answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3) {
        StringBuilder sb = new StringBuilder();
        String[] json = JSON.replaceAll("\"", "").split("[ {,}]");
        String[] dictionary;

        for (String item : json) {
            dictionary = item.split(":");
            if (dictionary.length == 2) {
                switch (dictionary[0]) {
                    case ("фамилия") -> {
                        sb.append("\n").append(ELEMENT1).append(dictionary[1]);
                    }
                    case ("оценка") -> {
                        sb.append(ELEMENT2).append(dictionary[1]);
                    }
                    case ("предмет") -> {
                        sb.append(ELEMENT3).append(dictionary[1]);
                    }
                }
            }
        }
        return sb;
    }


    public static void answer2(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3) {
        StringBuilder sb = new StringBuilder();
        String[] json = JSON.replaceAll("\"", "").split("[ {,}]");
        String[] dictionary;

        for (String item : json) {
            dictionary = item.split(":");
            if (dictionary.length == 2) {
                if (dictionary[0].equals("фамилия")) sb.append("\n").append(ELEMENT1).append(dictionary[1]);
                if (dictionary[0].equals("оценка")) sb.append(ELEMENT2).append(dictionary[1]);
                if (dictionary[0].equals("предмет")) sb.append(ELEMENT3).append(dictionary[1]);
            }
        }
        System.out.println(sb);
    }
}



