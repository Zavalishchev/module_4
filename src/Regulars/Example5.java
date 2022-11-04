package Regulars;

//Сгенерировать строку номеров телефонов в формате «+7 (926) 123-4567» с разделителем «;».
//Найти «платиновые» номера телефонов, оканчивающиеся на 6 нулей.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example5 {
    public static void main(String[] args) {
        StringBuilder strB = new StringBuilder();
        Pattern pat = Pattern.compile("^(\\d{3})(\\d{4})$");
        for (int i = 1000000; i < 9999999; i++) {
            Matcher matcher = pat.matcher(Integer.toString(i));
            if (matcher.find()) {
                strB.append("+7(926) ").append(matcher.group(1)).append("-").append(matcher.group(2)).append("; ");
            }
        }
        pat = Pattern.compile("(\\d[0]{2})-([0]{4})");
        Matcher matcher2 = pat.matcher(strB);
        while (matcher2.find()) {
            System.out.println("+7(926) " + matcher2.group(1) + "-" + matcher2.group(2) +"; ");
        }
    }
}
