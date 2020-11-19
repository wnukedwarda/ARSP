package Lesson.L03.EX06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise06Test {
    private Exercise06 exercise06;
    private String text;
    private String tabString[];
    private String oftenest;
    private int length;

    @BeforeEach
    void setUp() {
        exercise06 = new Exercise06();
        text = "Cracovia Cracow";
        tabString = new String[]{"Cr","covi"," Cr", "cow"};
        oftenest = "a";
        length = 4;
        exercise06.whichCharIsOftenest(text);
    }

    @Test
    void whichCharIsOftenest() {
        assertEquals(exercise06.getOftenestChar(),oftenest);
        assertEquals(exercise06.getTabString().length, length);
        assertArrayEquals(exercise06.getTabString(),tabString);
    }
}