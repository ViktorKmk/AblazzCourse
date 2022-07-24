package Homeworks.Homework2.BaseTask4;

// Задание №4
// Создать два класса, которые описывают какое либо животное (имеют два атрибута).
// Написать к ним конструктор, сеттеры, геттеры.
// Создать экземпляры этих двух животных.

public class Base4 {
    public static void main(String[] args) {
        System.out.println("Базовый уровень\nЗадача №4\n");
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Шарик", 4);
        System.out.println("dog1 : " + dog1.getName() + " " + dog1.getAge());
        System.out.println("dog2 : " + dog2.getName() + " " + dog2.getAge());
        dog1.setName("Дружок");
        dog1.setAge(6);
        System.out.println("dog1 : " + dog1.getName() + " " + dog1.getAge());
        dog1.bark();
        dog2.eat();
        System.out.println();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Барсик", "Рыжий");
        System.out.println("cat1 : " + cat1.getName() + " " + cat1.getColor());
        System.out.println("cat2 : " + cat2.getName() + " " + cat2.getColor());
        cat1.setName("Пушок");
        cat1.setColor("Серый");
        System.out.println("cat1 : " + cat1.getName() + " " + cat1.getColor());
        cat1.meow();
        cat2.eat();
    }
}
