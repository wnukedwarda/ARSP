package Lesson.L02.EX07;

import Lesson.ContentOfEx;

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

    public void solve (){
        System.out.println(ContentOfEx.L02_EX07);
        System.out.println();
        System.out.println("Hash Map:");
        printMap(hash);
        System.out.println();
        System.out.println("Linked Map:");
        printMap(linked);
        System.out.println();
        System.out.println("Tree Map:");
        printMap(tree);
    }

    private void printMap(Map<Integer, String> map) {
        map.forEach((k,v) -> System.out.println("Key: " + k + ", Value: " + v));
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
