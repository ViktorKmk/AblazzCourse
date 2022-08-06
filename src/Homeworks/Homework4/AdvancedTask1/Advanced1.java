package Homeworks.Homework4.AdvancedTask1;

import java.util.Arrays;
import java.util.List;

public class Advanced1 {
    public static void main(String[] args) {
        Pine pine = new Pine();
        Fir fir = new Fir();
        Rose rose = new Rose();
        Fern fern = new Fern();

        List<Smelling> canSmell = Arrays.asList(pine, fir, rose);
        List<Blooming> canBloom = Arrays.asList(rose, fern);

        for (Smelling anything : canSmell) {
            anything.smell();
        }
        for (Blooming anything : canBloom) {
            anything.bloom();
        }


    }
}
