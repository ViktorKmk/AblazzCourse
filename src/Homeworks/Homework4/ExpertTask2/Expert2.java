package Homeworks.Homework4.ExpertTask2;

public class Expert2 {
    public static void main(String[] args) {
        Car car1 = new Car(5000);
        CarShop carShop1 = new CarShop(car1);
        carShop1.sellCar();

        System.out.println();

        Car car2 = new Car(-200);
        CarShop carShop2 = new CarShop(car2);
        carShop2.sellCar();


    }
}
