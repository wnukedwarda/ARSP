package Lesson.L02.EX08;

import Lesson.ContentOfEx;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise08 {
    private Map<String, List<Integer>> gradeses;

    public Exercise08() {
        this.gradeses = new HashMap<>();
        fillMap(gradeses);
    }

    private static void fillMap(Map<String, List<Integer>> map) {
        map.put("j.polski", Arrays.asList(3, 2, 4, 2, 4));
        map.put("matematyka", Arrays.asList(5, 5, 5, 5, 5));
        map.put("j.angielski", Arrays.asList(4, 5, 4, 5, 4));
    }

    public void solve() {
        System.out.println(ContentOfEx.L02_EX08);
        System.out.println();
        System.out.println("Gradeses: ");
        gradeses.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
