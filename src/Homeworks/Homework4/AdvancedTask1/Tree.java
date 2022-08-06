package Homeworks.Homework4.AdvancedTask1;

public abstract class Tree implements Smelling{
    private int cones;

    public Tree() {
    }

    public Tree(int cones) {
        this.cones = cones;
    }

    public int getCones() {
        return cones;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

}
