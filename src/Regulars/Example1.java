package Regulars;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Напишите регулярку,
// которая найдет в строке aba aba a!a abba adca abea строки abba adca abea по шаблону: буква a, 2 любых символа, буква a.
public class Example1 {
    public static void main(String[] args) {
        String str = "aba aba a!a abba adca abea";
        Pattern pat = Pattern.compile("a..a");
        Matcher matc = pat.matcher(str);
        System.out.println(matc.replaceAll(""));
    }
}
