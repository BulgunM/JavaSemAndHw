package Homework1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        transferValue();
    }

    /*
    Дан массив nums = [3,2,2,3] и число val = 3.
    Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
     */

    private static void transferValue() {
        int[] array;
        array = new int[] {3,2,2,3};
        int value = 3;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                int temp = array[i];
                array[value] = array[i];
                array[i] = temp;
                value++;
            }
            }
        }
        //System.out.println(Arrays.toString(array));

    }


