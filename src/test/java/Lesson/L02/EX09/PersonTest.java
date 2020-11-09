package Lesson.L02.EX09;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person person;
    private String name;
    private String lastName;
    private int age;
    private String job;

    @BeforeEach
    void setUp() {
        name = "Grzegorz";
        lastName = "Pietrzyk";
        age = 28;
        job = "programmer";
        person = new Person(name,lastName,age,job);
    }

    @Test
    void testPerson(){
        assertEquals(name,person.getName());
        assertEquals(lastName,person.getLastName());
        assertEquals(age,person.getAge());
        assertEquals(job,person.getJob());
        assertNotEquals("Józek", person.getName());
    }
}