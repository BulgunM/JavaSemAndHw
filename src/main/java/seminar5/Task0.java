package seminar5;

import java.util.HashMap;
import java.util.Map;

public class Task0 {
    public static void main(String[] args) {
        Map<String, String> passports = new HashMap<>();
        passports.put("12345", "Иванов");
        passports.put("78963", "Петров");
        passports.put("52369", "Иванов");
        passports.put("25364", "Васильев");
        passports.put("75145", "Иванов");
        passports.put("79305", "Петров");

        for (String key : passports.keySet()) {
            System.out.println(key + " - " + passports.get(key));
        }

        for (Map.Entry<String, String> entry : passports.entrySet()) {
            System.out.println(entry + " - " + entry.getValue());
        }
    }
}
