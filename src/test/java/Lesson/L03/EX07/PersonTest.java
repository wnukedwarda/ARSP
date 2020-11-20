package Lesson.L03.EX07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person person;
    private static final String NAME = "Andrzej";
    private static final String SURNAME = "Józkowiak";
    private static final String PESEL = "84031249003";
    private static final int AGE = 36;
    private static final String BORN_DATE = "12.03.1984";
    private static final String SEX = "male";

    @BeforeEach
    void setUp() {
        person = new Person(NAME,SURNAME,PESEL);
    }

    @Test
    public void testPerson(){
        assertEquals(person.getName(),NAME);
        assertEquals(person.getSurname(),SURNAME);
        assertEquals(person.getPesel(), PESEL);
    }

    @Test
    public void testSetBornDate(){
        assertEquals(person.getBornDate(),BORN_DATE);
    }

    @Test
    public void testSetAge(){
        assertEquals(person.getAge(),AGE);
    }

    @Test
    public void testSetSex(){
        assertEquals(person.getSex(),SEX);
    }
}