package Homeworks.Homework2;

// Задание №3
// Задача: Повара попросили сделать салат.
// Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
// Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
// Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
// Если ингредиентов нет, то повар объявляет: У меня ничего нет
// Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
// Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
// Проверьте работоспособность условий, через изменение значения переменных.

public class BaseTask3 {
    public static void main(String[] args) {
        System.out.println("\nБазовый уровень\nЗадача №3");

        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;

        if (!vegetables) {
            System.out.println("У меня ничего нет");
        } else if (chicken && vegetables && sausage && toast) {
            System.out.println("Цезарь");
        } else if (vegetables && eggs && (sour || chicken)) {
            System.out.println("Ольвье");
        } else {
            System.out.println("Овощной");
        }
    }
}
