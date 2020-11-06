package Lesson.L02.EX01;

import Lesson.L02.EX01.Exercise01;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Exercise01Test {
    private Exercise01 exercise01;
    private List<Double> oczekiwany1 = Arrays.asList(4.67, 2.67, 3.0, 2.33);

    @BeforeEach
    void setUp(){
        exercise01 = new Exercise01();
    }

    @Test
    void testSrednia(){
        assertEquals(oczekiwany1, exercise01.average());
    }

}