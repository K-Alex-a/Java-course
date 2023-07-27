package Home_works.Seminar_02;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Random;

/*=======================================================================
* Сортировка пузырьком с логированием
* Реализуйте алгоритм сортировки пузырьком числового массива,
* результат после каждой итерации запишите в лог-файл.
* Напишите свой код в методе sort класса BubbleSort.
* Метод sort принимает на вход один параметр: int[] arr - числовой массив
* После каждой итерации, ваш код должен делать запись в лог-файл 'log.txt'
* в формате год-месяц-день час:минуты {массив на данной итерации}.
* Пример
* arr = new int[]{9, 4, 8, 3, 1};
* sort(arr)
* // При чтении лог-файла получим:
* 2023-05-19 07:53 [4, 8, 3, 1, 9]
* 2023-05-19 07:53 [4, 3, 1, 8, 9]
* 2023-05-19 07:53 [3, 1, 4, 8, 9]
* 2023-05-19 07:53 [1, 3, 4, 8, 9]
* 2023-05-19 07:53 [1, 3, 4, 8, 9]
=======================================================================*/
public class Task_02 {
    public static void main(String[] args) throws IOException {
//        int[] array = new int[5];
//        int[] array = {4, 8, 3, 1, 9};
        int[] array = {3, 4, 8, 2, 5, 7, 1, 6, 9, 10};
//        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 10};
//        fillMatrix(array);
        printMatrix(array);
        bubbleSort(array);


    }


    public static void bubbleSort(int[] array) throws IOException {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now().truncatedTo(ChronoUnit.MINUTES);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        String text = formatter.format(date);

        FileWriter fw = new FileWriter("log.txt");
        String result;
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    result = date + " " + time + " " + Arrays.toString(array);
//                    System.out.println(result);
                }
            }
            fw.write(date + " " + time + " " + Arrays.toString(array));
            fw.append('\n');
            fw.flush();
        }
    }


    public static void fillMatrix(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
    }

    public static void printMatrix(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
