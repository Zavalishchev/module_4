import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {
    public static void main(String[] args) {
        String text = "1It is 2interesting TO 4study VERY666, Делайте обучение интересней";
        String strPat = "[a-zA-Z]+";
        String str1 = "";
        Pattern pattern = Pattern.compile(strPat);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            str1 += matcher.group() + " ";
        }
        str1 = str1.toLowerCase();
        String str2 = "";
        str2 = str2 + str1.substring(0, 1).toUpperCase();
        for (int i = 1; i < str1.length(); i++) {
            str2 = str2 + str1.substring(i, i + 1);
        }
        System.out.println(str2.strip());
    }
}
