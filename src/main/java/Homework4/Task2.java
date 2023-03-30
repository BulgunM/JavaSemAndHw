package Homework4;

/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */

import java.util.Collections;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(task2());
    }

    private static LinkedList<String> task2() {
        LinkedList<String> list = new LinkedList<>();
        Collections.addAll(list, "first", "second", "third", "fourth");
        LinkedList<String> newList = new LinkedList<>();
        for (String part : list) {
            newList.addFirst(part);
        }
        return newList;
    }
}

