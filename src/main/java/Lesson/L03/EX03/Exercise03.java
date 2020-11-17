package Lesson.L03.EX03;

import Lesson.ContentOfEx;

import java.util.Arrays;

public class Exercise03 {
    private int countPrefix;
    private int countSufix;

    public Exercise03() {
        this.countPrefix = 0;
        this.countSufix = 0;
    }

    public int getCountPrefix() { return countPrefix; }
    public int getCountSufix() { return countSufix; }

    public void prefixes(String tab[], String prefix, String sufix) {
        for (String s : tab) {
            if (s.equals(prefix)) countPrefix++;
            if (s.equals(sufix)) countSufix++;
        }
    }
     public void solve(){
         System.out.println(ContentOfEx.L03_EX03);
         System.out.println();
         String prefixes [] = {"1212","111","00","6754","0323","00","00"};
         String sufix = "00";
         String prefix = "1212";
         System.out.println("Prefixes and Sufixes: ");
         Arrays.stream(prefixes).forEach(el-> System.out.print(el + ", "));
         System.out.println();
         System.out.println("Sample prefix: '1212' , Sample sufix: '00'");
         prefixes(prefixes,prefix,sufix);
         System.out.println("Prefixes " + prefix + " are " + countPrefix + ", Sufixes " + sufix + " are " + countSufix);
     }
}
