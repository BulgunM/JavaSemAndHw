package seminar2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //firstTask();
        //System.out.println(builder());
        //System.out.println(compressString());
    }

    private static void firstTask() {
        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            sb.append((char) (random.nextInt(1000)));
        }
        System.out.println(sb.toString());
    }

    /*
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
 */

    private static StringBuilder builder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int number = scanner.nextInt();
        System.out.print("Введите первый элемент массива: ");
        String first = scanner.next();
        System.out.print("Введите второй элемент массива: ");
        String second = scanner.next();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                sb.append(first);
            } else {
                sb.append(second);
            }
        }
        return sb;
    }

    /*
    Напишите метод, который сжимает строку.
    Пример: вход aaaabbbcdd.
     */

    private static StringBuilder compressString() {
        StringBuilder sb = new StringBuilder();
        String str = "aaaabbbcdd";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1)).append(count);
        return sb;
    }

}
