package Lesson.L03.EX02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise02Test {
    private Exercise02 exercise02;
    private String sPrefix;
    private String sTab[];

    @BeforeEach
    void setUp() {
        exercise02 = new Exercise02();
        sPrefix = "11";
        sTab = new String[]{"111","11","00","12345","0987","11"};
        exercise02.prefixes(sTab,sPrefix);
    }


    @Test
    void prefixes() {
        assertEquals(exercise02.getCountPrefix(), 2);
        assertNotEquals(exercise02.getCountPrefix(),3);
    }
}