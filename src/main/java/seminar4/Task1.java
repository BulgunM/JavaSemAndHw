package seminar4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("value? index?");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                System.out.println("bye");
                System.out.println("You`r list: " + list);
                break;
            }
            String[] splitInput = input.split(" ");
            if (splitInput.length != 2) {
                System.out.println("Invalid input");
                continue;
            }
            String text = splitInput[0];
            int num = (Integer.parseInt(splitInput[1]) - 1);

            if (text.equals("print")) {
                if (list.size() <= num) {
                    System.out.println("Invalid position");
                }
            }
        }
    }
}