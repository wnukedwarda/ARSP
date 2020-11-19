package Lesson.L03.EX05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise05Test {
    private Exercise05 exercise05;
    private String name1;
    private String name2;
    private String name3;

    @BeforeEach
    void setUp() {
        exercise05 = new Exercise05();
        name1 = "Andrzej";
        name2 = "Kasia";
        name3 = "Marcelina";
    }

    @Test
    void testIsMale() {
        assertFalse(exercise05.isFemale(name1));
        assertTrue(exercise05.isFemale(name2));
        assertTrue(exercise05.isFemale(name3));
    }
}