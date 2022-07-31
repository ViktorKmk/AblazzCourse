package Homeworks.Homework3.BaseTask1;

public abstract class Cars {
    private String name;

    public Cars() {
    }

    public Cars (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void startMoving() {
        System.out.println("Машина " + name + " начала движение");
    }

    public void stopMoving() {
        System.out.println("Машина " + name + " остановилась");
    }

    public void turnOnHeadlights() {
        System.out.println("Машина " + name + " включила фары");
    }
}
