package Lesson.L03.EX05;

import Lesson.ContentOfEx;

import java.util.Arrays;
import java.util.List;

public class Exercise05 {
    public boolean isFemale(String imie){
        return imie.endsWith("a")? true:false;
    }

    public void solve(){
        System.out.println(ContentOfEx.L03_EX05);
        System.out.println();
        List<String> names = Arrays.asList("Józek","Andrzej","Sara","Kasia","Monika");
        System.out.println("Whether name is female? :");
        names.stream()
                .forEach(name -> System.out.println(name + " : " + isFemale(name)));
    }
}
