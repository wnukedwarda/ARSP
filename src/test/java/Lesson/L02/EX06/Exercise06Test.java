package Lesson.L02.EX06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class Exercise06Test {
    private Exercise06 exercise06;
    private String temp;
    private Set<String> word;
    private Set<String> distinctToken;

    @BeforeEach
    void setUp(){
        exercise06 = new Exercise06();
        temp = "Alamakoota";
        word = Set.copyOf(Arrays.asList(temp.split("")));
        distinctToken = exercise06.distincToken(temp);

    }

    @Test
    void distincToken() {
        assertEquals(word,distinctToken);
    }
}