package seminar5;

/*
Написать метод, который переведет число из римского формата записи в арабский.
Например, MMXXII = 2022
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(createHashMap());
        convertNumber();
    }

    private static Map<String, Integer> createHashMap() {
        Map<String, Integer> romanianNumbers = new HashMap<>();
        romanianNumbers.put("I", 1);
        romanianNumbers.put("V", 5);
        romanianNumbers.put("X", 10);
        romanianNumbers.put("L", 50);
        romanianNumbers.put("C", 100);
        romanianNumbers.put("D", 500);
        romanianNumbers.put("M", 1000);

        return romanianNumbers;
    }

    private static Integer convertNumber() {
        Map<String, Integer> romanianNumber = createHashMap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в римском формате: ");
        String rom = scanner.next();
        int result = 0;
        for (int i = 0; i < rom.length() - 1; i++) {
            int currrent = romanianNumber.get(Character.toString((rom.charAt(i))));
            int next = romanianNumber.get(Character.toString((rom.charAt(i + 1))));
            if (currrent < next) {
                result -= currrent;
            } else {
                result += currrent;
            }
        }
        result += romanianNumber.get(Character.toString((rom.charAt(romanianNumber.size()))));

        System.out.println(result);
        return result;
    }
}
