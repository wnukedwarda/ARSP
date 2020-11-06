package Lesson.L02.EX01;

import Lesson.ContentOfEx;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise01 {
    private List<String> students;
    private List<List<Double>> gradeses;

    public Exercise01() {
        students = Arrays.asList("Andrzej", "Józek", "Grzesiek", "Karolina");
        gradeses = Arrays.asList(Arrays.asList(5.0, 4.0, 5.0),
                Arrays.asList(2.0, 2.0, 4.0),
                Arrays.asList(3.0, 3.0, 3.0),
                Arrays.asList(1.0, 5.0, 1.0));
    }

    public List<Double> average() {
        double avg = 0;
        int index = 0;
        List<Double> result = new ArrayList<>();
        System.out.println("Average grades:");
        for (List<Double> list : gradeses) {
            for (Double grades : list) {
                avg += grades;
            }

            result.add(round(avg / list.size()));
            System.out.println(index + 1 + ". " + students.get(index)
                    + ": " + round(avg / list.size()));
            index++;
            avg = 0;
        }
        return result;
    }


    private double round(double number) {
        BigDecimal decimal = new BigDecimal(number);
        BigDecimal rounded = decimal.setScale(2, BigDecimal.ROUND_HALF_DOWN);
        return rounded.doubleValue();
    }

    public void solve() {
        System.out.println(ContentOfEx.L02_EX01);
        System.out.println("Sample lists: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i) + ": " + gradeses.get(i));
        }
        System.out.println();
        average();
    }
}
