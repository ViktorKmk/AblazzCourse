package Homeworks.Homework2;

// Продвинутый уровень
// Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
// пока не получиться больше 1_000_000.
// Дано:
//    double increment = 0.01123;
//    double result = 0;
// Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
// Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
// Внимание: число может измениться, и не должно приводить к изменению вашего кода.

public class AdvancedTask1 {
    public static void main(String[] args) {
        System.out.println("\nПродвинутый уровень\nЗадача №1");
        double targetValue = 1_000_000;
        double increment = 0.01123;
        double result = 0;
        int iterCount = 0;
        if (increment <= 0) {
            System.out.println("Целевое значение недостижимо, инкремент должен быть положительным");
        } else {
            while (result <= targetValue) {
                result += increment;
                iterCount++;
            }
            System.out.println("Итоговое значение = " + result + "\nКоличество итераций = " + iterCount);
        }
    }
}
