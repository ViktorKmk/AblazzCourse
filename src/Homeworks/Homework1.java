package Homeworks;

import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        BaseTask1.run();
        BaseTask2.run();
        BaseTask3.run();
        AdvancedTask1.run();
        AdvancedTask2.run();
        AdvancedTask3.run();
        AdvancedTask4.run();
        ExpertTask1.run();
    }
}


//Базовый уровень
//Задача №1
class BaseTask1 {
    static void run() {
        System.out.println("\nБазовый уровень\nЗадача №1");
        //
        //Дано (переменные ниже менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже) используя String.trim()
        //затроить (Можно вызвать тольку одну команду System.out.println())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!
        //
        String correctString = hi.trim() + world.toLowerCase() + newLine;
        System.out.println(correctString.repeat(3));
    }
}


//Базовый уровень
//Задача №2
class BaseTask2 {
    static void run() {
        System.out.println("\nБазовый уровень\nЗадача №2");
        //
        //Создать переменные с ростом (!в метрах), весом в кило.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.0345645
        //
        double height = 1.80;
        double weight = 75.0;
        double BMI = weight/(height*height);
        System.out.println("Рост = " + height + " м, вес = " + weight + " кг\nИМТ = " + String.format("%.2f", BMI));
    }
}


//Базовый уровень
//Задача №3
class BaseTask3 {
    static void run() {
        System.out.println("\nБазовый уровень\nЗадача №3");
        //
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        //Ожидаемый результат:
        //abcde
        //abche
        //
        char[] arr1 = {'a', 'b', 'c', 'd', 'e'};
        String str1 = new String(arr1);
        System.out.println(str1);
        arr1[3] = 'h';
        String str2 = String.valueOf(arr1);
        System.out.println(str2);
    }
}


//Продвинутый уровень
//Задача №1
class AdvancedTask1 {
    static void run() {
        System.out.println("\nПродвинутый уровень\nЗадача №1");
        //
        //Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"
        //
        String num_text = "234";
        String some_text = "some_text";
        int answer = Integer.parseInt(num_text) + some_text.length();
        System.out.println("Число \"234\" плюс длина строки \"some_text\" = " + answer);
    }
}


//Продвинутый уровень
//Задача №2
class AdvancedTask2 {
    static void run() {
        System.out.println("\nПродвинутый уровень\nЗадача №2");
        //
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        //
        double a = 3, b = 5, exp = 2;
        int answer = (int)Math.pow((a+b), exp);
        System.out.println("(a+b)^2 = " + answer + " при a=3, b=5");
    }
}


//Продвинутый уровень
//Задача №3
class AdvancedTask3 {
    static void run() {
        System.out.println("\nПродвинутый уровень\nЗадача №3");
        //
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
        //
        int[] arr1 = {1, 2, 5, 7, 10};
        int[] arr2 = {2, 3, 2, 17 ,15};
        // Для двух массивов разной произвольной длины количество перемножаемых позиций будет равно кочичеству
        // чисел в наименьшем массиве
        int[] resArr = new int[arr1.length + arr2. length + Math.min(arr1.length, arr2. length)];
        for (int i = 0; i<resArr.length; i++) {
            if (i < arr1.length) resArr[i] = arr1[i];
            else if (i < (arr1.length + arr2.length)) resArr[i] = arr2[i - arr1.length];
            else resArr[i] = arr1[i - arr1.length - arr2.length] * arr2[i - arr1.length - arr2.length];
        }
        System.out.println(Arrays.toString(resArr));
    }
}


//Продвинутый уровень
//Задача №4
class AdvancedTask4 {
    static void run() {
        System.out.println("\nПродвинутый уровень\nЗадача №4");
        //
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран
        //
        System.out.println("В слове \"Hello world!\" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран");
        String helloString = "Hello world!";
        System.out.println(helloString.replace('l','r').toUpperCase().substring(0,8));
    }
}


//Экспертный уровень
//Задача №1
class ExpertTask1 {
    static void run() {
        System.out.println("\nЭкспертный уровень\nЗадача №1");
        //
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //Входящий стринг <client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>
        //Вернет - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //Входящий - <client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>
        //Вернет - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"
        //
        String testString1 = "<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>";
        String testString2 = "<client>(Какие то данные подлиннее)<data></data></client>";
        String testString3 = "<client>(Данные)<data>Петров Фёдор Сергеевич;79991113344</data></client>";
        String testString4 = "<client><data>oneMoreTest@mail.ru</data></client>";

        System.out.println("\nВходящая строка - " + testString1);
        System.out.println("После маскирования - " + maskPersonalData(testString1));
        System.out.println("\nВходящая строка - " + testString2);
        System.out.println("После маскирования - " + maskPersonalData(testString2));
        System.out.println("\nВходящая строка - " + testString3);
        System.out.println("После маскирования - " + maskPersonalData(testString3));
        System.out.println("\nВходящая строка - " + testString4);
        System.out.println("После маскирования - " + maskPersonalData(testString4));
    }

    static String maskPersonalData(String inputXML) {
        String anyData = inputXML.substring(inputXML.indexOf("<client>") + "<client>".length(), inputXML.indexOf("<data>"));
        String personalData = inputXML.substring(inputXML.indexOf("<data>") + "<data>".length(), inputXML.indexOf("</data>"));
        if (personalData.length() == 0) return inputXML;
        String[] personalDataArray = personalData.split(";");
        String[] maskPersonalDataArray = new String[personalDataArray.length];
        for (int i = 0; i < personalDataArray.length; i++) {
            if (personalDataArray[i].contains("@")) maskPersonalDataArray[i] = maskEMail(personalDataArray[i]);
            else if (personalDataArray[i].contains(" ")) maskPersonalDataArray[i] = maskFullName(personalDataArray[i]);
            else maskPersonalDataArray[i]  = maskPhoneNumber(personalDataArray[i]);
        }
        return "<client>" + anyData + "<data>" + String.join(";", maskPersonalDataArray) +
                "</data></client>";
    }

    static String maskPhoneNumber(String phoneNumber) {
        StringBuilder phoneNumberBuff = new StringBuilder(phoneNumber);
        // Считаем что номер всегда одного формата и содержит 11 знаков
        return phoneNumberBuff.replace(3, 5, "***").toString();
    }

    static String maskEMail(String eMail) {
        StringBuilder eMailBuff = new StringBuilder(eMail);
        return eMailBuff.replace(eMail.indexOf('@')-1, eMail.lastIndexOf('.'),
                "*@"+"*".repeat(eMail.lastIndexOf('.')-eMail.indexOf('@')-1)).toString();
    }

    static String maskFullName(String fullName) {
        StringBuilder fullNameBuff = new StringBuilder(fullName);
        return fullNameBuff.replace(1, fullName.indexOf(' ')-1, "*".repeat(fullName.indexOf(' ')-2))
                .replace(fullName.lastIndexOf(' ')+2, fullName.length(), ".").toString();
    }
}

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder
