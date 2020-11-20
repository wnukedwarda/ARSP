package Lesson.L03.EX07;

import Lesson.ContentOfEx;

public class Exercise07 {
    private Person person;
    private static final String NAME = "Grzegorz";
    private static final String SURNAME = "Pietrzyk";
    private static final String PESEL = "92110212473";

    public void solve() {
        System.out.println(ContentOfEx.L03_EX07);
        System.out.println();
        person = new Person(NAME, SURNAME, PESEL);
        System.out.println("Entered data:");
        System.out.println("Name: " + NAME);
        System.out.println("Surname: " + SURNAME);
        System.out.println("PESEL: " + PESEL);
        System.out.println("------------------");
        System.out.println("Data of person: ");
        System.out.println(person);
    }
}
