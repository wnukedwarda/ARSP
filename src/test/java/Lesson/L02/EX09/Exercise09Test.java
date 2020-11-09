package Lesson.L02.EX09;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class Exercise09Test {
    Exercise09 exercise09;
    private Map<String,Person> people;
    private String key1;
    private String key2;
    private String key3;

    @BeforeEach
    void setUp() {
        exercise09 = new Exercise09();
        people = new TreeMap<>();
        key1 = "92110212478";
        key2 = "81041243567";
        key3 = "90120143954";
        people.put("92110212478", new Person("Grzegorz", "Pietrzyk", 28, "Programmer"));
        people.put("81041243567", new Person("Barbara", "Józkowiak", 39, "Footballer"));
        people.put("90120143954", new Person("Anna", "Wójtowicz", 30, "Teacher"));
    }

    @Test
    void testFillMap(){
        assertEquals(exercise09.getPeople().get(key1),people.get(key1));
        assertEquals(exercise09.getPeople().get(key2),people.get(key2));
        assertEquals(exercise09.getPeople().get(key3),people.get(key3));
    }
}