package Homeworks.Homework4.AdvancedTask1;

public class Rose extends Plant implements Smelling{
    @Override
    public void bloom() {
        System.out.println("Роза : умеет цвести");
    }

    @Override
    public void smell() {
        System.out.println("Роза : умеет пахнуть");
    }
}
