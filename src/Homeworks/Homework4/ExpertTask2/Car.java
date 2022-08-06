package Homeworks.Homework4.ExpertTask2;

public class Car {
    private int price;

    public Car() {
    }

    public Car(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void showPrice() throws PriceException {
        if (price < 0) {
            throw new PriceException("Неизвестна мне");
        } else {
            System.out.println(price);
        }
    }
}
