package Zajecia.Zajecia02;

import Zajecia.Polecenia;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad0201 {
    private List<String> studenci;
    private List<List<Double>> oceny;

    public Zad0201() {
        studenci = Arrays.asList("Andrzej", "Józek", "Grzesiek", "Karolina");
        oceny = Arrays.asList(Arrays.asList(5.0, 4.0, 5.0),
                Arrays.asList(2.0, 2.0, 4.0),
                Arrays.asList(3.0, 3.0, 3.0),
                Arrays.asList(1.0, 5.0, 1.0));
    }

    public List<Double> srednia() {
        double wynik = 0;
        int index = 0;
        List<Double> result = new ArrayList<>();
        System.out.println("Srednia ocen:");
        for (List<Double> lista : oceny) {
            for (Double ocena : lista) {
                wynik += ocena;
            }

            result.add(zaokraglij(wynik / lista.size()));
            System.out.println(index + 1 + ". " + studenci.get(index)
                    + ": " + zaokraglij(wynik / lista.size()));
            index++;
            wynik = 0;
        }
        return result;
    }


    private double zaokraglij(double liczba) {
        BigDecimal decimal = new BigDecimal(liczba);
        BigDecimal rounded = decimal.setScale(2, BigDecimal.ROUND_HALF_DOWN);
        return rounded.doubleValue();
    }

    public void rozwiazanie() {
        System.out.println(Polecenia.ZAJ01_ZAD01);
        System.out.println("Przykładowe listy: ");
        for (int i = 0; i < studenci.size(); i++) {
            System.out.println((i + 1) + ". " + studenci.get(i) + ": " + oceny.get(i));
        }
        System.out.println();
        srednia();
    }
}
