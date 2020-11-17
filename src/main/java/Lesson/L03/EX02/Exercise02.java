package Lesson.L03.EX02;

import Lesson.ContentOfEx;

import java.util.Arrays;

public class Exercise02 {
    private String sampleTab [];
    private String samplePrefix;

    public Exercise02() {
        this.sampleTab = new String[]{"32323","1112", "10","546","10","864","10"};
        this.samplePrefix = "10";
    }

    public String[] getSampleTab() {
        return sampleTab;
    }

    public String getSamplePrefix() {
        return samplePrefix;
    }

    public int prefixes(String tab[], String prefix) {
        int result = 0;
        for (String s : tab) {
            if (s.equals(prefix)) result++;
        }
        return result;
    }

    public void solve(){
        System.out.println(ContentOfEx.L03_EX02);
        System.out.println();
        System.out.println("Sample Prefixes:");
        Arrays.stream(sampleTab).forEach(el-> System.out.print(el +", "));
        System.out.println();
        System.out.println("Sample Prefix: " + samplePrefix);
        System.out.println("Prefixes " + samplePrefix + " are " + prefixes(sampleTab, samplePrefix));
    }
}
