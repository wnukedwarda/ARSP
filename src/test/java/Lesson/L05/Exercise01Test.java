package Lesson.L05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise01Test {

    Exercise01 exercise01;
    private String text1;
    private String text2;
    private String text3;
    private String text4;

    @BeforeEach
    void setUp() {
        exercise01 = new Exercise01();
        text1 = "kajak";
        text2 = "Andrzej";
        text3 = "Kobyła ma mały bok";
        text4 = "Kobyła ma duży bok";

    }

    @Test
    void palindrom() {
        assertTrue(exercise01.palindrom(this.text1));
        assertTrue(exercise01.palindrom(this.text3));
        assertFalse(exercise01.palindrom(this.text2));
        assertFalse(exercise01.palindrom(this.text4));
    }
}