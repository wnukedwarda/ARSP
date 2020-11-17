package Lesson.L03.EX03;

public class Exercise03 {
    public String prefixes(String tab[], String prefix, String sufix) {
        StringBuilder result = new StringBuilder();
        int ilePrefix = 0;
        int ileSufix = 0;
        for (String s : tab) {
            if (s.equals(prefix)) ilePrefix++;
            if (s.equals(sufix)) ileSufix++;
        }
        result.append("Prefix: ").append(ilePrefix)
                .append("  Sufix: ").append(ileSufix);

        return result.toString();
    }
}
