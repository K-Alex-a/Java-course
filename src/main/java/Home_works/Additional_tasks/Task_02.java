package Home_works.Additional_tasks;

import java.util.Arrays;
import java.util.Random;

/*===============================================================================
* Объявлена доска 9х9. Необходимо отвалидировать в соответствии с правилами:
* 1. каждая строка должна содержать цифру 1-9 без повторения
* 2. каждая колонка должна содержать цифру 1-9 без повторения
* 3. каждый под блок из 9 элемнтов 3х3 должна содержать цифру 1-9 без повторения.
* Ограничения: board.length == 9
*              board[i].length == 9
*              board[i][j] значение число или '.'
* Пример:
* {'5','3','.','.','7','.','.','.','.'}
* {'6','.','.','1','9','5','.','.','.'}
* {'.','9','8','.','.','.','.','6','.'}
* {'8','.','.','.','6','.','.','.','3'}
* {'4','.','.','8','.','3','.','.','1'}
* {'7','.','.','.','2','.','.','.','6'}
* .....
===============================================================================*/
public class Task_02 {
    public static void main(String[] args) {
        Integer[][] board = new Integer[9][9];
        printArray(fillArray(board));
        System.out.println();
//        printArray(validationArray(board));

    }


    public static Integer[][] fillArray(Integer[][] board) {
        Random rand = new Random();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = rand.nextInt(10);
            }
        }
        return board;
    }

    public static void printArray(Integer[][] board) {
        for (Integer[] integers : board) {
            System.out.println(Arrays.toString(integers));
        }
    }

//    public static Integer[][] validationArray(Integer[][] board) {
//
//        for (int i = 1; i < board.length; i++) {
//            for (int j = 1; j < board.length; j++) {
//
//                }
//            }
//        return board;
//        }

}
