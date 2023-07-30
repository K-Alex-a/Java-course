package Home_works.Seminar_02;

import java.util.Arrays;

/*=======================================================================
* Дана строка sql-запроса:
* select * from students where "
* Сформируйте часть WHERE этого запроса, используя StringBuilder.
* Пример данных для фильтрации приведены ниже в виде json-строки.
* Если значение null, то параметр не должен попадать в запрос.
* Пример:
* {"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
* Напишите свой код в методе answer класса Answer.
* Метод answer принимает на вход два параметра:
* String QUERY - начало SQL-запроса
* String PARAMS - JSON с параметрами
=======================================================================*/
public class Task_01 {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"null\", \"age\":\"18\"} ";
        } else {
            QUERY = args[0];
            PARAMS = args[1];
        }
        System.out.println(answer(QUERY, PARAMS));

    }


    public static StringBuilder answer(String QUERY, String PARAMS) {
        StringBuilder sb = new StringBuilder(QUERY);
        String[] params = PARAMS.replaceAll("\"", "").split("[ {,}]");
        System.out.println(Arrays.toString(params));
        String[] dictionary;

        for (String item : params) {
            dictionary = item.split(":");
            if (dictionary.length == 2 && !dictionary[1].contains("null")) {
                sb.append(dictionary[0]).append("='").append(dictionary[1]).append("' and ");
            }
        }
        sb.delete(sb.length() - 5, sb.length());
        return sb;
    }
}