package Lesson.L02.EX06;

import Lesson.ContentOfEx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise06 {
    private Set<String> wordSet;

    public Exercise06() {
        this.wordSet = new HashSet<>();
    }


    public Set<String> distincToken(String word) {
        wordSet = Set.copyOf(Arrays.asList(word.split("")));
        return wordSet.stream()
                .distinct()
                .collect(Collectors.toSet());
    }

    public void solve(){
        System.out.println(ContentOfEx.L02_EX06);
        System.out.println();
        String word = "Andrzejejejej";
        System.out.println("Original word: " + word);
        System.out.print("Distinct token of word: ");
        distincToken(word).forEach(System.out::print);
    }
}
