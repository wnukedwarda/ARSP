package Lesson.L02.EX09;

import Lesson.ContentOfEx;

import java.util.Map;
import java.util.TreeMap;

public class Exercise09 {
    private Map<String, Person> people;

    public Exercise09() {
        this.people = new TreeMap<>();
        fillMap();
    }

    public Map<String, Person> getPeople() {
        return people;
    }

    private void fillMap() {
        people.put("92110212478", new Person("Grzegorz", "Pietrzyk", 28, "Programmer"));
        people.put("81041243567", new Person("Barbara", "Józkowiak", 39, "Footballer"));
        people.put("90120143954", new Person("Anna", "Wójtowicz", 30, "Teacher"));
    }

    public void solve() {
        System.out.println(ContentOfEx.L02_EX09);
        System.out.println();
        System.out.println("Loaded Map: ");
        people.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
