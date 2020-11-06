package Lesson.L02.EX02;

import Lesson.L02.EX02.Exercise02;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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