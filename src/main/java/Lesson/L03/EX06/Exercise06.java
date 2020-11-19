package Lesson.L03.EX06;

import Lesson.ContentOfEx;

import java.util.Arrays;

public class Exercise06 {
    private String oftenestChar;
    private int max;
    private int count;
    private String tabString[];

    public Exercise06() {
        this.oftenestChar = "";
        this.max = 0;
        this.count = 0;
    }

    public void whichCharIsOftenest(String tekst) {
        for (int i = 0; i < tekst.length(); i++) {
            for (int j = 0; j < tekst.length(); j++) {
                if (tekst.charAt(i) == tekst.charAt(j))
                    count++;
            }
            if (count > max) {
                max = count;
                oftenestChar = String.valueOf(tekst.charAt(i));
            }
            count = 0;
        }
        tabString = tekst.split(oftenestChar);
    }
    public void solve(){
        System.out.println(ContentOfEx.L03_EX06);
        System.out.println();
        String text = "Cracovia Cracow";
        whichCharIsOftenest(text);
        System.out.println();
        System.out.println("Number of elements in created board: " + tabString.length);
        System.out.println("The Char on which the substitution was made: " + oftenestChar);
        System.out.println("Created board:");
        Arrays.stream(tabString).forEach(ch -> System.out.print(ch + ", "));
    }


    public String getOftenestChar() {
        return oftenestChar;
    }

    public int getMax() {
        return max;
    }

    public int getCount() {
        return count;
    }

    public String[] getTabString() {
        return tabString;
    }
}
