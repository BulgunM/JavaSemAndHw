package Homework3;

/*
Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
 */

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(100));
        }
        System.out.println(array);

        array.removeIf(number -> number % 2 == 0);
        System.out.println(array);
    }
}

