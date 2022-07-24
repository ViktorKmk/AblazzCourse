package Homeworks.Homework2.AdvancedTask4;

// Задание №4:
// Написать систему управления складскими запасами. Создать класс склад, создать класс работники
// (написать геттеры на все аттрибуты).
// Количество работников минимум 3.
// Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
// Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
// "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
// У склада есть только одна позиция - Водка.

public class Advanced4 {
    public static void main(String[] args) {
        System.out.println("\nПродвинутый уровень\nЗадача №4");
        Warehouse warehouse1 = new Warehouse(100);
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();

        worker1.spoilVodka(warehouse1, 1);
        worker2.spoilVodka(warehouse1, 2);
        worker3.spoilVodka(warehouse1, 7);
        System.out.println("Товара на складе осталось " + warehouse1.getVodka());
        System.out.println("worker1 всего испортил " + worker1.getSpoiledVodka());
        System.out.println("worker2 всего испортил " + worker2.getSpoiledVodka());
        System.out.println("worker3 всего испортил " + worker3.getSpoiledVodka());
        System.out.println();

        worker1.spoilVodka(warehouse1, 80);
        worker2.spoilVodka(warehouse1, 20);
        worker3.spoilVodka(warehouse1, 10);
        System.out.println("Товара на складе осталось " + warehouse1.getVodka());
        System.out.println("worker1 всего испортил " + worker1.getSpoiledVodka());
        System.out.println("worker2 всего испортил " + worker2.getSpoiledVodka());
        System.out.println("worker3 всего испортил " + worker3.getSpoiledVodka());
    }
}
