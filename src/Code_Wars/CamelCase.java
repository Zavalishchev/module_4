package Code_Wars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CamelCase {

    // решение в одну строку, а не 45 -_-
    //static String toCamelCase(String s){
    //    return Pattern.compile("[-|_](.)").matcher(s).replaceAll(r -> r.group(1).toUpperCase());
    //  }

    public static String toCamelCase(String s) {
        if (s != null) {
            String result = "";
            String temp = "";
            char[] chars = s.toCharArray();
            char sign = ' ';

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '-' || chars[i] == '_') {
                    sign = chars[i];
                }
            }

            switch (sign) {
                case '-':
                    String[] strArr = s.split("-");
                    for (int i = 0; i < strArr.length; i++) {
                        if (i == 0) {
                            temp = strArr[i].substring(0, 1);
                            strArr[i] = strArr[i].substring(1);
                            result += temp + strArr[i];
                        } else {
                            temp = strArr[i].substring(0, 1).toUpperCase();
                            strArr[i] = strArr[i].substring(1);
                            result += temp + strArr[i];
                        }
                    }
                    break;
                case '_':
                    String[] strArr1 = s.split("_");
                    for (int i = 0; i < strArr1.length; i++) {
                        if (i == 0) {
                            temp = strArr1[i].substring(0, 1);
                            strArr1[i] = strArr1[i].substring(1);
                            result += temp + strArr1[i];
                        } else {
                            temp = strArr1[i].substring(0, 1).toUpperCase();
                            strArr1[i] = strArr1[i].substring(1);
                            result += temp + strArr1[i];
                        }
                    }
                    break;
            }
            return result;
        }
        return null;
    }

    public static void main(String[] args) {
        String input = "The-Stealth-Warrior";
        System.out.println("input: "+ input + ";  output: " + toCamelCase(input));

        String input1 = "the_stealth_warrior";
        System.out.println("input: "+ input1 + ";  output: " + toCamelCase(input1));

        String input2 = "BlackSideLakeDesertRed";
    }
}
