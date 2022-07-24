package Homeworks.Homework2;

// Базовый уровень
// Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
// Ожидаемый результат: 1а 2а 3а .. 100а

public class BaseTask1 {
    public static void main(String[] args) {
        System.out.println("\nБазовый уровень\nЗадача №1");
        System.out.println("Написать цикл, который выводит через пробел 100 чисел с приставкой \"a\"");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "a ");
        }
    }
}
