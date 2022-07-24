package Homeworks.Homework2.ExpertTask;

import java.util.*;

// Экспертный уровень:
// Предыстория: Мы находимся в статистическом институте. Хочется понять уровень миграции между регионами за месяц.
// Для этого было решено произвести анализ передвижения автомобилей: на границе каждого региона стоят камеры,
// фиксирующие въезд и выезд автомобилей. Формат автомобильного номера: (буква)(3 цифры)(2 буквы)(2-3 цифры)
// К474СЕ178 - где 178 регион

// Задача №1: узнать сколько всего машин со спец номерами: начинаются на M и заканчиваются на АВ.
// Не повторяющиеся

//Входящие данные
// Map<Integer, Map<String, String[]>> - где ключ первого уровня - номер региона,
// out, input - ключи второго уровня (выезд, въезд), и String[] - массивы номеров.
// { 1 : {
//      "out" : ["К474СЕ178"],
//      "input": ["А222РТ178"]
//    },
//   2 : {
//        "out" : ["К722АВ12", "А222РТ178"],
//        "input" : ["М001АВ01", "А023РВ73"],
//   }
// ..
//  }


public class ExpertTask {
    public static void main(String[] args) {
        System.out.println("\nЭкспертный уровень\nЗадача №1");
        Map<Integer, Map<String, String[]>> bigData = GeneratorExpertHomework.getData();
        List<String> specialNumbers = new ArrayList<>();

        for (Map.Entry<Integer, Map<String, String[]>> entry1 : bigData.entrySet()) {
            Map<String, String[]> oneRegionData = entry1.getValue();
            for (Map.Entry<String, String[]> entry2 : oneRegionData.entrySet()) {
                String[] oneRegionInputOrOut = entry2.getValue();
                for (String carNumber : oneRegionInputOrOut) {
                    if (carNumber.matches("М\\d{3}АВ\\d{2,}") && !specialNumbers.contains(carNumber)) {
                        specialNumbers.add(carNumber);
                    }
                }
            }
        }
        System.out.println("Количество машин со спец номерами = " + specialNumbers.size());
        System.out.println(specialNumbers);
    }
}
