package Lesson.L03.EX01;

import Lesson.ContentOfEx;

public class Exercise01 {
    private static final double maxWidth = 50;

    public boolean fieldWidth(String name, String surname, double width){
        return width>maxWidth?true:false;
    }

    public void solve(){
        System.out.println(ContentOfEx.L03_EX01);
        System.out.println();
        System.out.println("Max. field width: 50, sample entered width: 2.5");
        System.out.println(fieldWidth("Grzegorz", "Pietrzyk", 2.5));
    }
}
