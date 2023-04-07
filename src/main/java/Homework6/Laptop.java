package Homework6;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков (ArrayList).
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
Выводить только те ноутбуки, что соответствуют условию
 */
public class Laptop {

    String model;
    String color;
    Integer price;
    private Integer mainMemory;

    public Laptop(String model, String color, Integer price, Integer mainMemory) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.mainMemory = mainMemory;
    }

    public void start() {
        System.out.println("Hello!");
    }

    public void work() {
        System.out.println("Working...");
    }

    public void end() {
        System.out.println("Bye!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMainMemory() {
        return mainMemory;
    }

    public void setMainMemory(Integer mainMemory) {
        this.mainMemory = mainMemory;
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", mainMemory=" + mainMemory +
                '}';
    }

}
