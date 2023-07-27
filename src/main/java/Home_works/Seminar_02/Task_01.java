package Home_works.Seminar_02;
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
        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        System.out.println(PARAMS);

    }

    public static StringBuilder answer(String QUERY, String PARAMS) {
        return null;
    }
}
