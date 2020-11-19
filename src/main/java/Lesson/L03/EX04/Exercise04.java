package Lesson.L03.EX04;

import Lesson.ContentOfEx;

public class Exercise04 {
    private StringBuilder result;

    public Exercise04() {
        this.result = new StringBuilder();
    }

    public StringBuilder getResult() {
        return result;
    }

    public String clipping(String text, int start, int end) {
        if(!result.toString().isEmpty()){
            result = new StringBuilder();
        }
        result.append("Original text: ")
                .append(text)
                .append(", cutting range: |")
                .append(start)
                .append(" - ")
                .append(end)
                .append("| , ")
                .append("cutting result: ")
                .append(text.substring(start, end))
                .append(" , ")
                .append("cutting length: ")
                .append(text.substring(start, end).length());
        return result.toString();
    }

    public void solve(){
        System.out.println(ContentOfEx.L03_EX04);
        System.out.println();
        String sampleText = "Szczecin";
        int start = 2;
        int end = 5;
        System.out.println(clipping(sampleText,start,end));
    }
}

