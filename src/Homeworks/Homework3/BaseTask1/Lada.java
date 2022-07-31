package Homeworks.Homework3.BaseTask1;

public class Lada extends Cars {
    public Lada() {
    }

    public Lada(String name) {
        super(name);
    }

    public void brokeDown() {
        System.out.println("Лада " + getName() + " сломалась");
    }
}
