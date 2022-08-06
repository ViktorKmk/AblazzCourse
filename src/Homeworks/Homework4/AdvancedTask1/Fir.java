package Homeworks.Homework4.AdvancedTask1;

public class Fir extends Tree{
    public Fir() {
    }

    public Fir(int cones) {
        super(cones);
    }

    @Override
    public void smell() {
        System.out.println("Ель : умеет пахнуть");
    }
}
