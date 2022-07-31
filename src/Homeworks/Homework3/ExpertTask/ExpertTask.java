package Homeworks.Homework3.ExpertTask;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ExpertTask {
    private static final String REPORT_HEADER = "магазин;доход;расход;дата";


    public static void main(String[] args) throws IOException {
        String folderName = "resource";
        String folderPath = System.getProperty("user.dir") + "\\src\\Homeworks\\Homework3\\ExpertTask\\" + folderName;

        List<String> reportsPaths = new ArrayList<>();
        Files.walk(Path.of(folderPath)).forEach(e -> reportsPaths.add(e.toString()));
        reportsPaths.remove(0); // Первым записался адрес всей папки, он не нужен

        //
        // Задача №1
        //
        String pyterochkaFileName = "pyterochkaProfitReport.txt";
        String pyterochkaPath = System.getProperty("user.dir") + "\\src\\Homeworks\\Homework3\\ExpertTask\\" + pyterochkaFileName;
        int month = 1;
        for (String report : reportsPaths) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(report))) {
                double profit = 0.0;
                while (bufferedReader.ready()) {
                    String line = bufferedReader.readLine();
                    if (!line.equals(REPORT_HEADER)) {
                        String[] data = line.split(";");
                        if (data[0].equals("pyterochka")) {
                            profit = profit + Double.parseDouble(data[1]) - Double.parseDouble(data[2]);
                        }
                    }
                }
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pyterochkaPath, true))) {
                    if (month == 1) bufferedWriter.write("Прибыль по магазину pyterochka по месяцам\n");
                    bufferedWriter.write(month++ + ".2012: " + String.format("%.2f", profit) + "\n");
                } catch (IOException e) {
                    System.out.println("Ошибка ввода-вывода " + e);
                }
            } catch (IOException e) {
                System.out.println("Ошибка ввода-вывода при чтении " + e);
            }
        }

        //
        // Задача №2
        //
        String costsFileName = "costsReport.txt";
        String costsPath = System.getProperty("user.dir") + "\\src\\Homeworks\\Homework3\\ExpertTask\\" + costsFileName;
        Map<String, Double> costs = new HashMap<>();
        for (String report : reportsPaths) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(report))) {
                while (bufferedReader.ready()) {
                    String line = bufferedReader.readLine();
                    if (!line.equals(REPORT_HEADER)) {
                        String[] data = line.split(";");
                        if (costs.containsKey(data[0])) {
                            costs.put(data[0], costs.get(data[0]) + Double.parseDouble(data[2]));
                        } else {
                            costs.put(data[0], Double.parseDouble(data[2]));
                        }

                    }
                }
            } catch (IOException e) {
                System.out.println("Ошибка ввода-вывода при чтении " + e);
            }
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(costsPath, true))) {
            bufferedWriter.write("Отчет о расходах за весь период по магазинам\n");
            for (Map.Entry<String, Double> entry1 : costs.entrySet()) {
                bufferedWriter.write("Расходы " + entry1.getKey() + " за весь период: " + String.format("%.2f", entry1.getValue()) + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }

    }
}
