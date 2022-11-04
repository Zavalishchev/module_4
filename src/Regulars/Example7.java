package Regulars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example7 {
    public static void main(String[] args) {
        String text = "До свиданья, друг мой, до свиданья." +
                "Милый мой, ты у меня в груди." +
                "Предназначенное расставанье" +
                "Обещает встречу впереди." +
                "До свиданья, друг мой, без руки, без слова," +
                "Не грусти и не печаль бровей," +
                "В этой жизни умирать не ново," +
                "Но и жить, конечно, не новей.";
        Pattern pattern = Pattern.compile("[^.!?][,\\s]*(друг)[^.!?]*[.!?]\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
