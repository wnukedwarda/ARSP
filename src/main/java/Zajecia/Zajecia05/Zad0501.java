package Zajecia.Zajecia05;

import Zajecia.Polecenia;

import java.util.Scanner;

public class Zad0501 {
    private Scanner scanner;

    public Zad0501() {
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

    public void rozwiazanie() {
        System.out.println(Polecenia.ZAJ05_ZAD01);
        System.out.println();
        System.out.println("Podaj słowo, bądź ciąg wyrazów, aby sprawdzić czy są palindromem:  ");
        System.out.println(palindrom(scanner.nextLine()));
    }
}
