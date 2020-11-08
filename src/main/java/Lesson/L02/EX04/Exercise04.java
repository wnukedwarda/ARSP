package Lesson.L02.EX04;
//utrudniłem sobie to zadanie na potrzeby testów
//początkowo kod był prostszy i krótki
//w zasadzie zawierał się w jednej metodzie
//która nic nie zwracała.

//na samym spodzie pierwotny kod

import Lesson.ContentOfEx;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise04 {
    private List<Integer> gradeses;
    private Random random = new Random();
    private List<Double> percentList;

    public Exercise04() {
        this.gradeses = new ArrayList<>();
        this.random = new Random();
        this.percentList = new ArrayList<>();
    }

    public List<Integer> getGradeses() {
        return gradeses;
    }

    public void setGradeses(List<Integer> gradeses) {
        this.gradeses = gradeses;
    }

    public List<Double> getPercentList() {
        return percentList;
    }

    public List<Integer> fillList(int nGrades) {
        for (int i = 0; i < nGrades; i++) {
            gradeses.add(random.nextInt(4) + 2);
            System.out.print(gradeses.get(i) + ", ");
        }
        System.out.println();
        return gradeses;
    }

    public List<Double> percentOfTotalScoore() {
        for (int i = 2; i <= 5; i++) {
            double percent = 0;
            for (int j = 0; j < gradeses.size(); j++) {
                if (gradeses.get(j) == i) {
                    percent++;
                }
            }
            percentList.add(round((percent * 100) / gradeses.size()));
        }
        return percentList;
    }

    private double round(double number) {
        BigDecimal decimal = new BigDecimal(number);
        BigDecimal rounded = decimal.setScale(2, BigDecimal.ROUND_HALF_DOWN);
        return rounded.doubleValue();
    }


    public void solve() {
        System.out.println(ContentOfEx.L02_EX04);
        System.out.println();
        System.out.println("Sample number of gradeses: " + 6);
        fillList(6);
        percentOfTotalScoore();
        System.out.println();
        printPercent();
    }

    private void printPercent() {
        for (int i = 0; i < percentList.size(); i++) {
            if (percentList.get(i) != 0)
                System.out.println("The grade " + (i + 2) + " contributes " + percentList.get(i) + "% to the total score.");
        }
    }
}

   /* public List<Integer> wypelnijListe(int iloscOcen){
        List<Integer> oceny = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < iloscOcen; i++) {
            oceny.add(random.nextInt(4)+2);
        }
        for (int i = 2; i <=5 ; i++) {
            double procent=0;
            for (int j = 0; j<iloscOcen; j++){
                if(oceny.get(j)==i){
                    procent++;
                }
            }
            if(procent>0){
                System.out.println("Ocena " + i + " ma " + (procent*100) / iloscOcen + "% udziału w calosci wyniku");
            }
        }
        return oceny;
    }
*/

