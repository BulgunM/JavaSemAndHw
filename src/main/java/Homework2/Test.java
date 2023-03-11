package Homework2;


/*
Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
который запишет эту строку в простой текстовый файл, обработайте исключения.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;



public class Test {
    public static void main(String[] args) {
        composeString();
    }

    public static void composeString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TEST".repeat(100));
        try {
            File file = new File("C:\\Users\\user\\IdeaProjects\\java_gb\\src\\main\\java\\Homework2\\Test.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(String.valueOf(sb));
            writer.close();
        } catch (Exception e) {
            System.out.println("FAIL");
        }
    }

}