package Homeworks.Homework2.BaseTask4;

public class Dog {

    private String name;
    private int age;

    public Dog() {
        this.name = "DefaultName";
        this.age = 1;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void bark() {
        System.out.println("Bark-bark");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }


}