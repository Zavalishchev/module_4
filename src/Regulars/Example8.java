package Regulars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example8 {
    public static void main(String[] args) {
        String text = "Рекс Лорд Лом Шарик Бобик Шалун";
        Pattern pattern = Pattern.compile("\\b[Л][а-я]+\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
