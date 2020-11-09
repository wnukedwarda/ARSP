package Lesson.L05.EX02;

import Lesson.ContentOfEx;

import java.util.Arrays;

public class Exercise02 {
    private static final String TEXT = "There's an evolutionary imperative why we give a crap about our family and friends. " +
            "And there's an evolutionary imperative why we don't give a crap about anybody else. " +
            "If we loved all people indiscriminately, we couldn't function.";
    private String tab[];

    public Exercise02() {
        this.tab = TEXT.split(" ");
    }

    public String maxLenghtOfWord() {
        String max = tab[0];
        int maxInd = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].length() >= max.length()) {
                max = tab[i];
                maxInd = i;
            }
        }
        System.out.println("Max. element : " + max + " position: " + maxInd);
        return max;
    }

    public String minLenghtOfWord() {
        String min = tab[0];
        int minInd = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].length() < 2) continue;
            if (tab[i].length() <= min.length()) {
                min = tab[i];
                minInd = i;
            }
        }
        System.out.println("Min. el. : " + min + " position: " + minInd);
        return min;
    }

    public void printShortestAndLongestWord() {
        int maxL = Arrays.stream(tab)
                .mapToInt(String::length)
                .max()
                .orElse(-1);

        System.out.println("Longest:");
        Arrays.stream(tab)
                .filter(word -> word.length() == maxL)
                .forEach(System.out::println);

        System.out.println("Shortest: ");
        int minL = Arrays.stream(tab)
                .mapToInt(String::length)
                .filter(wordL -> wordL > 1)                     //
                .min()
                .orElse(-1);
        Arrays.stream(tab)
                .filter(word -> word.length() == minL)
                .forEach(System.out::println);
    }

    public void printAllWordsWithReplace(char oldChar, char newChar) {
        Arrays.stream(tab).
                forEach(word -> System.out.println(word.replace(oldChar, newChar)));
    }

    public void solve() {
        System.out.println(ContentOfEx.L02_EX05);
        System.out.println();
        maxLenghtOfWord();
        minLenghtOfWord();
        printShortestAndLongestWord();
        System.out.println();
        printAllWordsWithReplace('a', 'W');
    }
}
