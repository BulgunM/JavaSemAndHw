package Homework1;

public class Task1 {
    public static void main(String[] args) {
    findMinAndMax();
    }

    /*
    Задать одномерный массив и найти в нем минимальный и максимальный элементы
     */

    private static void findMinAndMax() {
        int[] array;
        array = new int[]{5, 12, 33, 8, 2, 24, 6};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Максимальный элемент в массиве равен " + max);
        System.out.println("Минимальный элемент в массиве равен " + min);
    }

}
