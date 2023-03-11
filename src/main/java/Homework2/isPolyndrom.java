package Homework2;

/*
Напишите метод, который принимает на вход строку (String)
и определяет является ли строка палиндромом (возвращает boolean значение).
 */


public class isPolyndrom {
    public static void main(String[] args) {
        System.out.println(isPolyndrom("lockol"));
    }


    private static boolean isPolyndrom(String word) {
        char[] array = word.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}