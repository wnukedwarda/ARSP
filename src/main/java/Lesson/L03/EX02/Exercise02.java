package Lesson.L03.EX02;

import Lesson.ContentOfEx;

import java.util.Arrays;

public class Exercise02 {
    public int getCountPrefix() {
        return countPrefix;
    }

    private int countPrefix;

    public int prefixes(String tab[], String prefix) {
        for (String s : tab) {
            if (s.equals(prefix)) countPrefix++;
        }
        return countPrefix;
    }

    public void solve(){
        System.out.println(ContentOfEx.L03_EX02);
        System.out.println();
        String sampleTab [] = {"32323","1112", "10","546","10","864","10"};
        String samplePrefix = "10";
        System.out.println("Sample Prefixes:");
        Arrays.stream(sampleTab).forEach(el-> System.out.print(el +", "));
        System.out.println();
        System.out.println("Sample Prefix: " + samplePrefix);
        System.out.println("Prefixes " + samplePrefix + " are " + prefixes(sampleTab, samplePrefix));
    }
}
