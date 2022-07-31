package Homeworks.Homework3.BaseTask1;

public class Toyota extends Cars {
    public Toyota() {
    }

    public Toyota(String name) {

        super(name);
    }

    public void turnOnMusic() {
        System.out.println("Тойота " + getName() + " включила музыку");
    }
}
