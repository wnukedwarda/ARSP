package Lesson.L03.EX02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise02Test {
    private Exercise02 exercise02a;
    private Exercise02 exercise02b;
    private String sPrefix;
    private String sTab [];

    @BeforeEach
    void setUp() {
        exercise02a = new Exercise02();
        exercise02b = new Exercise02();
        sPrefix = "11";
        sTab = new String[]{"111","11","00","12345","0987","11"};
    }

    @Test
    void prefixes() {
        assertEquals(exercise02a.prefixes(exercise02a.getSampleTab(),exercise02a.getSamplePrefix()),3);
        assertEquals(exercise02b.prefixes(sTab,sPrefix),2);
    }
}