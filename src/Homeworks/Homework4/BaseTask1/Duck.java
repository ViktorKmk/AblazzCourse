package Homeworks.Homework4.BaseTask1;

public class Duck implements Flying{
    private boolean isInjured ;

    public Duck() {
    }

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Ошибка: утка ранена");
        } else {
            System.out.println("Утка летит");
        }
    }
}
