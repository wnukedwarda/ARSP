package Lesson.L03.EX03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise03Test {
    private Exercise03 exercise03;
    private String sTab[];
    private String sPrefix;
    private String sSufix;

    @BeforeEach
    void setUp() {
        exercise03 = new Exercise03();
        sTab = new String[]{"031", "051121", "031", "00", "031", "00", "11111"};
        sPrefix = "031";
        sSufix = "00";
        exercise03.prefixes(sTab, sPrefix, sSufix);
    }

    @Test
    void prefixes() {
        assertEquals(exercise03.getCountSufix(), 2);
        assertEquals(exercise03.getCountPrefix(), 3);
        assertNotEquals(exercise03.getCountPrefix(),11);
        assertNotEquals(exercise03.getCountSufix(), 0);
    }
}