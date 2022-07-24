package Homeworks.Homework2.BaseTask4;

public class Cat{

    private String name;
    private String color;

    public Cat() {
        this.name = "DefaultName";
        this.color = "White";
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    public void meow() {
        System.out.println("Meow-meow");
    }

    public void eat() {
        System.out.println("Cat is eating");
    }

}
