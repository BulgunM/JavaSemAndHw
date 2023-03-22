package Homework3;

/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
 */

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(100));
        }
        System.out.println(array);;

        int min = array.get(0);
        int max = 0;
        double avg = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
            if (array.get(i) > max) {
                max = array.get(i);
            }
            avg += array.get(i);

        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(avg / array.size());
    }
}

