package Homeworks.Homework4.BaseTask1;

public class Plane implements Flying{
    private int countPassengers;

    public Plane() {
    }

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
        } else {
            System.out.println("Самолёт летит");
        }
    }
}
