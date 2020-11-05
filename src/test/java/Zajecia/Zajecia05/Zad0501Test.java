package Zajecia.Zajecia05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zad0501Test {

    Zad0501 zad0501;
    private String text1;
    private String text2;
    private String text3;
    private String text4;

    @BeforeEach
    void setUp() {
        zad0501 = new Zad0501();
        text1 = "kajak";
        text2 = "Andrzej";
        text3 = "Kobyła ma mały bok";
        text4 = "Kobyła ma duży bok";

    }

    @Test
    void palindrom() {
        assertTrue(zad0501.palindrom(this.text1));
        assertTrue(zad0501.palindrom(this.text3));
        assertFalse(zad0501.palindrom(this.text2));
        assertFalse(zad0501.palindrom(this.text4));
    }
}