package seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
Замерьте время, за которое в ArrayList добавятся 10000 элементов.
Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
 */

public class Task0 {
    public static void main(String[] args) {
        task0();
    }

    private static void task0() {
        final int SIZE = 1_000_000;
        Random random = new Random();

        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(0,1);
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));

        List<Integer> linkedList = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(0,1);
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));
    }
}

