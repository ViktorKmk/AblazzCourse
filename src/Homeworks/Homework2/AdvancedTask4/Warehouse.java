package Homeworks.Homework2.AdvancedTask4;

public class Warehouse {
    private int vodka;

    public Warehouse() {
        this.vodka = 0;
    }

    public Warehouse(int vodka) {
        this.vodka = vodka;
    }

    public int getVodka() {
        return vodka;
    }

    public void setVodka(int vodka) {
        this.vodka = vodka;
    }

    public int takeVodka(int number) {
        if (vodka < number) {
            int vodkaRemainder = vodka;
            vodka = 0;
            return vodkaRemainder;
        } else {
            vodka -= number;
            return number;
        }
    }
}
