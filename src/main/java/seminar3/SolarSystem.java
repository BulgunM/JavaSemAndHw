package seminar3;

/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.

Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
List<String> names = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun",
"Pluto");
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SolarSystem {
    public static void main(String[] args) {
        printNamesAndCounts();
    }

    private static void printNamesAndCounts() {
        List<String> names = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun",
                "Pluto");

        ArrayList<String> multiNames = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            multiNames.add(names.get(random.nextInt(names.size())));
        }
        System.out.println(multiNames);

        int count = 0;
        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < multiNames.size(); j++) {
                if (names.get(i).equals(multiNames.get(j))) {
                    count++;
                }
            }
            System.out.printf("%s\t=>\t%s%n", names.get(i), count);
        }

        for (int i = 0; i < multiNames.size(); i++) {
            int j = i + 1;
            while (j < multiNames.size()) {
                if (multiNames.get(i).equals(multiNames.get(j))) {
                    multiNames.remove(j);
                } else {
                    j++;
                }
            }
        }
        System.out.println(multiNames);

        File planets = new File("C:\\Users\\user\\IdeaProjects\\java_gb\\src\\main\\java\\seminar3\\planets.txt");
        if (!planets.isFile()) {
            throw new RuntimeException("Неверный файл");
        }
        try (PrintWriter pw = new PrintWriter(planets)) {
            pw.println(multiNames);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
