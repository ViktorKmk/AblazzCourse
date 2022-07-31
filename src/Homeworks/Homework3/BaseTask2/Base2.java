package Homeworks.Homework3.BaseTask2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Base2 {
    public static void main(String[] args) {
        System.out.println("\nБазовый уровень\nЗадача №2");
        String fileName = "my_first_file.txt";
        String filePath = System.getProperty("user.dir") + "\\src\\Homeworks\\Homework3\\BaseTask2\\" + fileName;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                System.out.print(line + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
