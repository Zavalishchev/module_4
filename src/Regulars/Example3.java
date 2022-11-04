package Regulars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example3 {
    public static void main(String[] args) {
        String years = "2000 2001 1998 1987 2022";
        Pattern pat = Pattern.compile("19\\d{2}\\s");
        Matcher match = pat.matcher(years);
        System.out.println(match.replaceAll(""));
    }
}
