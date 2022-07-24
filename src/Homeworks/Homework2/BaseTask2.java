package Homeworks.Homework2;

// Задание №2
// Дано:
// int ageChildren = 10;
// Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
// если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
// Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
// Проверьте работоспособность условий, через изменение значения переменной.

public class BaseTask2 {
    public static void main(String[] args) {
        System.out.println("\nБазовый уровень\nЗадача №2");
        for (int ageChildren = 1; ageChildren < 21; ageChildren++) {
            if (ageChildren < 6) {
                System.out.println(ageChildren + " лет - пошел в сад");
            } else if (ageChildren < 11) {
                System.out.println(ageChildren + " лет - пошел в младшую школу");
            } else if (ageChildren < 17) {
                System.out.println(ageChildren + " лет - пошел в среднюю школу");
            } else {
                System.out.println(ageChildren + " лет - пошел в университет");
            }
        }
    }
}
