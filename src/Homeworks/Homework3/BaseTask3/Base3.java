package Homeworks.Homework3.BaseTask3;

import java.io.*;

public class Base3 {
    public static void main(String[] args) {
        System.out.println("\nБазовый уровень\nЗадача №3");
        FinancialRecord record = new FinancialRecord(500, 300);
        String fileName = "report.txt";
        String filePath = System.getProperty("user.dir") + "\\src\\Homeworks\\Homework3\\BaseTask3\\" + fileName;

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            String line = "Доходы = " + record.getIncomes() + " , расходы = " + record.getOutcomes();
            bufferedWriter.write(line);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
