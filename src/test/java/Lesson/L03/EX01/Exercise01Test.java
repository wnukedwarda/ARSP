package Lesson.L03.EX01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Exercise01Test {

    Exercise01 exercise01;
    private double sampleWidth1;
    private double sampleWidth2;

    @BeforeEach
    void setUp(){
        exercise01 = new Exercise01();
        sampleWidth1 = 51;
        sampleWidth2 = 32;
    }

    @Test
    void fieldWidth() {
        assertTrue(exercise01.fieldWidth("Grzegorz", "Pietrzyk",sampleWidth1));
        assertFalse(exercise01.fieldWidth("Grzegorz","Pietrzyk",sampleWidth2));
    }
}