package Lesson.L02.EX07;

import java.util.*;

public class Exercise07 {
    private Map<Integer, String> hash;
    private Map<Integer, String> linked;
    private Map<Integer, String> tree;

    public Exercise07() {
        this.hash = new HashMap<>();
        fillMap(hash);
        this.linked = new LinkedHashMap<>();
        fillMap(linked);
        this.tree = new TreeMap<>();
        fillMap(tree);
    }

    private static void fillMap(Map<Integer, String> map) {
        map.put(2, "Zenon");
        map.put(3, "Grzegorz");
        map.put(5, "Paweł");
        map.put(4, "Karolina");
        map.put(1, "Sara");
    }

    public Map<Integer, String> getHash() {
        return hash;
    }

    public void setHash(Map<Integer, String> hash) {
        this.hash = hash;
    }

    public Map<Integer, String> getLinked() {
        return linked;
    }

    public void setLinked(Map<Integer, String> linked) {
        this.linked = linked;
    }

    public Map<Integer, String> getTree() {
        return tree;
    }

    public void setTree(Map<Integer, String> tree) {
        this.tree = tree;
    }
}
