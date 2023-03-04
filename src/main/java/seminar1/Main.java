package seminar1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //inputNameAndPrint();
        printMaxDigitOne();
    }

    /*
    Написать программу, которая запросит пользователя ввести <Имя> в консоли.
    Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
     */
    private static void inputNameAndPrint() {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.printf("Привет, %s!", name);
        in.close();
    }

    /*
    Дан массив двоичных чисел, например [1,1,0,1,1,1],
    вывести максимальное количество подряд идущих 1.
     */
    private static void printMaxDigitOne() {
        int[] array = new int[] {1,1,0,1,1,1,0,1,1,1,1};
        int countOne = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1) {
                countOne = 0;
            }
            else {
                countOne++;
            }
            max = countOne;
        }
        System.out.println(max);
    }

}


