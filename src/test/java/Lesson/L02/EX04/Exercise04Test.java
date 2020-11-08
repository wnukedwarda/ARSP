package Lesson.L02.EX04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercise04Test {
    Exercise04 exercise04a;
    Exercise04 exercise04b;
    List<Double> percents;

    @BeforeEach
    void setUp() {
        exercise04a = new Exercise04();
        exercise04b = new Exercise04();
        exercise04b.setGradeses(Arrays.asList(4,4,4,2,3,3,5,5,5,5));
        percents = Arrays.asList(10.0,20.0,30.0,40.0);
        exercise04b.percentOfTotalScoore();
    }

    @Test
    void testFillList() {
        exercise04a.fillList(5);
        assertFalse(exercise04a.getGradeses().isEmpty());
        assertEquals(exercise04a.getGradeses().size(), 5);
        assertNotEquals(exercise04a.getGradeses().size(), 4);
    }

    @Test
    void testPercentOfTotalScore() {
        assertEquals(percents,exercise04b.getPercentList());
    }
}