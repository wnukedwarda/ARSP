package Lesson.L05.EX01;

import Lesson.ContentOfEx;

import java.util.Scanner;

public class Exercise01 {
    private Scanner scanner;

    public Exercise01() {
        this.scanner = new Scanner(System.in);
    }

    public boolean palindrom(String text) {
        text = text.toUpperCase().replace(" ", "");
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt((text.length() - 1) - i))
                return false;
        }
        return true;
    }

    public void solve() {
        System.out.println(ContentOfEx.L05_EX01);
        System.out.println();
        System.out.println("Enter a word or a sequence of words to check if they are a palindrome:  ");
        System.out.println(palindrom(scanner.nextLine()));
    }
}
