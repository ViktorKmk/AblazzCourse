package Homeworks.Homework4.AdvancedTask1;


public class Pine extends Tree{
    public Pine() {
    }

    public Pine(int cones) {
        super(cones);
    }

    @Override
    public void smell() {
        System.out.println("Сосна : умеет пахнуть");
    }
}
