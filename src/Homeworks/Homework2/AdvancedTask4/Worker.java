package Homeworks.Homework2.AdvancedTask4;

public class Worker {
    private int spoiledVodka;

    public Worker() {
        this.spoiledVodka = 0;
    }

    public Worker(int spoiledVodka) {
        this.spoiledVodka = spoiledVodka;
    }

    public int getSpoiledVodka() {
        return spoiledVodka;
    }

    public void setSpoiledVodka(int spoiledVodka) {
        this.spoiledVodka = spoiledVodka;
    }

    public void spoilVodka(Warehouse warehouse, int numberOfSpoiled) {
        int spoiledVodka = warehouse.takeVodka(numberOfSpoiled);
        this.spoiledVodka += spoiledVodka;
        System.out.println("Ура я испортил водку " + spoiledVodka + " шт!");
    }
}
