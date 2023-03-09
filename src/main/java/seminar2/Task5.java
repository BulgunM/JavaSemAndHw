package seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Logger;

public class Task5 {

    /*
    1. Напишите метод, который вернет содержимое текущей папки в виде массива строк.
    2. Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
    3. Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
     */

    static Logger logger = Logger.getLogger("Exercise5");

    public static void main(String[] args) {
        exercise5("C://Users//user//IdeaProjects//java_gb");
    }


    private static void exercise5(String pathDir) { //  в аргументы передаем нашу папку/директорию
        String[] dirListNames = convertPathToNameArray(pathDir); //
        try {
            dirListNames = convertPathToNameArray(pathDir);
        } catch (RuntimeException e) {
            logger.severe(e.getMessage());
            throw e;
        }

        StringBuilder sb = new StringBuilder();
        for (String fileName : dirListNames) { // пробегает по всем файлам и добавляет в стрингбилдер
            sb.append(fileName).append(System.lineSeparator()); // перенос строки
        }

        try (PrintWriter pw = new PrintWriter("src/main/resources/files/seminar2.txt")) { // записывает файлы
            pw.print(sb);
        } catch (FileNotFoundException e) { // если в момент объявления try что-то будет не так, появится это исключения
            logger.severe(e.getMessage());
            throw new RuntimeException(e);
        }

    }

    private static String[] convertPathToNameArray(String path) { // возвращает массив из папок и файлов
        File dir = new File(path); // возвращает директорию в виде файла
        if (!dir.isDirectory()) {
            //return new String[]{};
            throw new RuntimeException("Директория по заданному пути не найдена"); // если по данному пути ничего нет, выходит исключение, для нас это ошибка
        }
        return dir.list(); // возвращает все, что есть в директории

    }
}
