package Homeworks.Homework4.BaseTask1;

import java.util.Arrays;
import java.util.List;

public class Base1 {
    public static void main(String[] args) {
        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Plane plane1 = new Plane(10);
        Plane plane2 = new Plane(-1);

        List<Flying> ducksAndPlanes = Arrays.asList(duck1, duck2, plane1, plane2);
        for (Flying duckOrPlane : ducksAndPlanes) {
            try {
                duckOrPlane.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
