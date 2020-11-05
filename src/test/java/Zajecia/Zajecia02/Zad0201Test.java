package Zajecia.Zajecia02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Zad0201Test {
    private Zad0201 zad0201;
    private List<Double> oczekiwany1 = Arrays.asList(4.67, 2.67, 3.0, 2.33);

    @BeforeEach
    void setUp(){
        zad0201 = new Zad0201();
    }

    @Test
    void testSrednia(){
        assertEquals(oczekiwany1, zad0201.srednia());
    }

}