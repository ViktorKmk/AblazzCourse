package Homeworks.Homework3.AdvancedTask1;

import Homeworks.Homework3.BaseTask1.*;

public class CarFactory {
    private static int ladaCount = 0;
    private static int toyotaCount = 0;

    public static Lada createLada() {
        return new Lada("lada" + ladaCount++);
    }

    public static Toyota createToyota() {
        return new Toyota("toyota" + toyotaCount++);
    }

}
