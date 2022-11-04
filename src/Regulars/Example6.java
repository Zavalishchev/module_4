package Regulars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example6 {
    public static void main(String[] args) {
        String text = "WrongMsisdnError SuccessfulTransaction TimeOutError InternalError SuccessfulTransaction " +
                "ExternalIDError SuccessfulTransaction WrongIDError InvalidArgumentError SuccessfulTransaction " +
                "SuccessfulTransaction SuccessfulTransaction WrongMsisdnError";
        Pattern pattern = Pattern.compile("(\\b[a-zA-Z]+)(Error)");
        Matcher matcher = pattern.matcher(text);
        String result = "";
        while (matcher.find()) {
            result += matcher.group() + " ";
        }
        System.out.println(result.strip());
    }
}
