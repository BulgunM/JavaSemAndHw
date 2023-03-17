package seminar3;

/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        System.out.println(arrayList());
    }

    private static ArrayList<Integer> arrayList() {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(100));
        }
        Collections.sort(array);
        return array;
    }

}
