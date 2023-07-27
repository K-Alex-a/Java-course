package Home_works.Seminar_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/*=================================================================
*Калькулятор с логированием
* Возьмите код от калькулятора с прошлого урока.
* К этому калькулятору нужно добавить логирование.
*
* Логи запишите в файл log.txt в формате:
* "гггг-мм-дд чч:мм User entered the first operand = {первое число}"
* "гггг-мм-дд чч:мм User entered the operation = {оператор}"
* "гггг-мм-дд чч:мм User entered the second operand = {второе число}"
* "гггг-мм-дд чч:мм Result is {результат}"
=================================================================*/
public class Task_04 {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        int a = rand.nextInt(50);
        int b = rand.nextInt(50);
        char op = '+';  // -, *, /

        fileLog(op, a, b);

    }

    static String printResult(char op, int a, int b) {
        String date = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(LocalDateTime.now());
        String firstOperand = date + " User entered the first operand = " + a;
        String operation = date + " User entered the operation = " + op;
        String secondOperand = date + " User entered the second operand = " + b;
        String resultString = date + " Result is " + calculate(op, a, b);

        return firstOperand + "\n"
                + operation + "\n"
                + secondOperand + "\n"
                + resultString;
    }


    public static int calculate(char op, int a, int b) {
        switch (op) {
            case ('+') -> {
                return a + b;
            }
            case ('-') -> {
                return a - b;
            }
            case ('*') -> {
                return a * b;
            }
            case ('/') -> {
                return a % b;
            }
            default -> System.out.println("Некорректный оператор: " + op);
        }
        return 0;
    }

    public  static void fileLog(char op, int a, int b) throws IOException {
        File log = new File("log.txt");
        FileWriter string = new FileWriter(log);
        string.write(printResult(op, a, b));
        string.flush();
        string.close();
        System.out.println(printResult(op, a, b));
    }

}
