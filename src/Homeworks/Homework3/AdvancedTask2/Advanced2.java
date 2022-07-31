package Homeworks.Homework3.AdvancedTask2;

import Homeworks.Homework3.BaseTask3.FinancialRecord;

import java.io.*;
import java.util.*;

public class Advanced2 {
    public static void main(String[] args) {
        System.out.println("\nПродвинутый уровень\nЗадача №2");
        final String INCOMES = "Доходы";
        final String OUTCOMES = "Расходы";
        Random random = new Random(1);

        String fileName = "report.txt";
        String filePath = System.getProperty("user.dir") + "\\src\\Homeworks\\Homework3\\AdvancedTask2\\" + fileName;

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < 10; i++) {
                FinancialRecord record = new FinancialRecord(random.nextInt(10000), random.nextInt(10000));
                Map<String, Integer> note = new HashMap<>();
                note.put(INCOMES, record.getIncomes());
                note.put(OUTCOMES, record.getOutcomes());
                bufferedWriter.write(note + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода при записи " + e);
        }


        int commonIncomes = 0;
        int commonOutcomes = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            while (bufferedReader.ready()) {
                Map<String, Integer> note = new HashMap<>();
                    String line = bufferedReader.readLine();
                for (String item : line.split(", ")){
                    note.put(
                            item.split("=")[0].replace("{", ""),
                            Integer.parseInt(item.split("=")[1].replace("}", ""))
                    );
                }
                commonIncomes += note.get(INCOMES);
                commonOutcomes += note.get(OUTCOMES);
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода при чтении " + e);
        }

        System.out.println("Общие доходы = " + commonIncomes + "\nОбщие расходы = " + commonOutcomes);

    }
}
