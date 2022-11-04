package Regulars;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {
    public static void main(String[] args) {
        String str = "aba aba a!a abba adca abea";
        Pattern pat = Pattern.compile("(ab)+");
        Matcher match = pat.matcher(str);

        System.out.println(match.replaceAll(""));
    }
}