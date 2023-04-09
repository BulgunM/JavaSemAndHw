package Homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Laptop laptopHonor = new Laptop("Honor MagicBook", "Grey", 41_000, 8);
        Laptop laptopHaier = new Laptop("Haier A1410EM", "Black", 23_000, 4);
        Laptop laptopHp = new Laptop("HP 15s-eq1145ur", "White", 85_000, 8);

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptopHonor);
        laptops.add(laptopHaier);
        laptops.add(laptopHp);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Какой размер памяти интересует? ");
        Integer memory = scanner.nextInt();
        for (Laptop laptop : laptops) {
            if (laptop.getMainMemory() <= memory) {
                System.out.println(laptop);
            }
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Какой цвет интересует? ");
        String inputColor = scanner2.next();
        for (Laptop laptop : laptops) {
            if (laptop.getColor().equalsIgnoreCase(inputColor)) {
                System.out.println(laptop);
            }
        }
    }
}
