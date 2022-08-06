package Homeworks.Homework4.ExpertTask2;

public class CarShop {
    private Car car;

    public CarShop(Car car) {
        this.car = car;
    }

    public void sellCar() {
        System.out.println("Здравствуй клиент, цена этого авто:");
        try {
            car.showPrice();
            System.out.println("Хочешь купить авто?");
        } catch (PriceException e) {
            System.out.println(e.getMessage());
            System.out.println("Давайте посмотрим другое авто?");
        }
    }
}
