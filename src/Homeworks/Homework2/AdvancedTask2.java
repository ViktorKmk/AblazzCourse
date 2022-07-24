package Homeworks.Homework2;

// Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
// Например, дано: [1,1,1,1,1]
// Ожидаемый результат: [0,1,0,1,0]
// Подсказка: прочитай про операнд "%".

import java.util.Arrays;

public class AdvancedTask2 {
    public static void main(String[] args) {
        System.out.println("\nПродвинутый уровень\nЗадача №2");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        System.out.println("Исходный массив\n" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if ( i % 2 == 0) {
                arr[i] = 0;
            }
        }
        System.out.println("Измененный массив\n" + Arrays.toString(arr));
    }
}
