package Homeworks.Homework3.BaseTask1;

public class Base1 {
    public static void main(String[] args) {
        System.out.println("\nБазовый уровень\nЗадача №1");
        Toyota toyota1 = new Toyota("toyota1");
        Toyota toyota2 = new Toyota("toyota2");
        Lada lada1 = new Lada("lada1");
        Lada lada2 = new Lada("lada2");

        toyota1.startMoving();
        toyota1.turnOnHeadlights();
        toyota1.turnOnMusic();

        toyota2.stopMoving();
        toyota2.turnOnHeadlights();
        toyota2.turnOnMusic();

        lada1.startMoving();
        lada1.turnOnHeadlights();
        lada1.brokeDown();

        lada2.stopMoving();
        lada2.turnOnHeadlights();
        lada2.brokeDown();



    }
}
