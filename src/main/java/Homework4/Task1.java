package Homework4;

/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.
 */

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку (print - распечатать список, revert - для удаления): ");
            String inputString = scanner.nextLine();

            if (inputString.equalsIgnoreCase("print")) {
                Iterator<String> iterator = list.descendingIterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            } else if (inputString.equalsIgnoreCase("revert")) {
                list.removeLast();
                System.out.println(list);
            } else {
                list.addLast(inputString);
            }
        }
    }
}
