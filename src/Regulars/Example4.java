package Regulars;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// регулярное выражение, которое находит все английские слова в тексте,
// начинающиеся и заканчивающиеся на букву s.

public class Example4 {
    public static void main(String[] args) {
        String str = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. " +
                "It is widely used to define a constraint on strings such as a password. " +
                "Regular Expressions are provided under java.util.regex package.";
        Pattern pat = Pattern.compile("\\bs[a-z]+s\\b");
        Matcher match = pat.matcher(str);
        while (match.find()) {
            int start = match.start();
            int end = match.end();
            System.out.println("found: " + start + ", " + end + " - " +str.substring(start, end));
        }
    }
}
