package Lesson.L02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise02Test {
    private Exercise02 exercise02;
    @BeforeEach
    void setUp() {
        exercise02 = new Exercise02();
    }

    @Test
    void solve() {
        exercise02.solve();
    }
}