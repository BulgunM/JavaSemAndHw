package Homework3;

/*
Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
 */

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>(List.of("New", "123", "World", "Hello", "85", "22"));
        for (int i = 0; i < str.size(); i++) {
            try {
                Integer.parseInt(String.valueOf(str.get(i)));
                str.remove(str.get(i));
                i--;
            } catch (NumberFormatException e) {
                System.out.println(str.get(i) + " это не число ");
            }
        }
        System.out.println(str);
    }
}
