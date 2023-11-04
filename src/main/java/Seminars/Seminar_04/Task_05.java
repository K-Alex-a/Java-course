package Seminars.Seminar_04;

import java.util.Stack;
/*=============================================================================================
* Если задана строка path, представлящая собой абсолютный путь (начинающийся с косой черты '/')
* к файлу или каталогу в файловой системе в стиле Unix, преобразуйте ее в каноничный путь.
* В файл.системе в стиле Unix точка '.' относится к текущему кааталогу, двойная точка '..'
* относится к каталогу на более высокий уровень, а любые несколько последовательныъ косых
* черт (например '//') рассмытриваются как одна косая черта '/'. Для этой проблемы любой другой
* формат, например, '....' рассматривается как имя файла или каталога.
* Каноничный путь должен иметь следующий формат:
* - Путь начинается с  одной косой черты '/'
* - Любые два каталога разделяются косой чертой '/'
* - Путь не заканчивается тегом '/'
* - Путь содержит только каталоги на пути от корневого каталога к целевому файлу или каталогу
* (т.е. без точки или двойной точки).
* Вернуть общий каноничный путь.
* Пример:      /home/ -> /home
*                /../ -> /
*         /home//foo/ ->/home/foo
=============================================================================================*/
public class Task_05 {
    public static void main(String[] args) {

        System.out.println("simplifyPath(/home/) = "
                + simplifyPath("/home/"));

        System.out.println("simplifyPath(/../) = "
                + simplifyPath("/../"));

        System.out.println("simplifyPath(/home//foo) = "
                + simplifyPath("/home//foo/"));
    }

    public static String simplifyPath(String path) {
        String[] arrayStr = path.split("/");
        Stack<String> result = new Stack<>();
        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i].equals("..")) {
                if (!result.isEmpty()) {
                    result.pop();
                }
            } else if (!arrayStr[i].isEmpty() && !arrayStr[i].equals(".")) {
                result.add(arrayStr[i]);
            }
        }

        String resStr = "/";
        for (int i = 0; i < result.size(); i++) {
            resStr += result.get(i) + "/";
        }

        if (resStr.length() > 1) {
            return resStr.substring(0, resStr.length() - 1);
        }
        return resStr;
    }



}

