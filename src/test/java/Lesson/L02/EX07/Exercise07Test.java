package Lesson.L02.EX07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class Exercise07Test {
    private Exercise07 exercise07;
    private Map<Integer,String> hashMap;
    private Map<Integer,String> linked;
    private Map<Integer,String> tree;

    @BeforeEach
    void setUp() {
        exercise07 =  new Exercise07();
        hashMap = new HashMap<>();
        tree = new TreeMap<>();
        linked = new LinkedHashMap<>();
    }

    @Test
    void testFillHashMap(){
        hashMap.put(2, "Zenon");
        hashMap.put(3, "Grzegorz");
        hashMap.put(5, "Paweł");
        hashMap.put(4, "Karolina");
        hashMap.put(1, "Sara");
        assertEquals(exercise07.getHash(), hashMap);
    }

    @Test
    void testFillLinkedMap(){
        linked.put(2, "Zenon");
        linked.put(3, "Grzegorz");
        linked.put(5, "Paweł");
        linked.put(4, "Karolina");
        linked.put(1, "Sara");
        assertEquals(exercise07.getLinked(), linked);
    }

    @Test
    void testFillTreeMap(){
        tree.put(2, "Zenon");
        tree.put(3, "Grzegorz");
        tree.put(5, "Paweł");
        tree.put(4, "Karolina");
        tree.put(1, "Sara");
        assertEquals(exercise07.getTree(),tree);
    }
}