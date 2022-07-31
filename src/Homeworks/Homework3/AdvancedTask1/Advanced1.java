package Homeworks.Homework3.AdvancedTask1;

import Homeworks.Homework3.BaseTask1.*;

import java.util.ArrayList;
import java.util.List;

public class Advanced1 {
    public static void main(String[] args) {
        System.out.println("\nПродвинутый уровень\nЗадача №1");
        List<Cars> carsArray = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            carsArray.add(CarFactory.createLada());
        }
        for (int i = 0; i < 20; i++) {
            carsArray.add(CarFactory.createToyota());
        }

        for (Cars car : carsArray) {
            if (car instanceof Lada) ((Lada) car).brokeDown();
            else if (car instanceof Toyota)  ((Toyota) car).turnOnMusic();

        }
    }
}
