import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextCleaner {
    public static void main(String[] args) {
        String str = "<strike>Это удалить!</strike>А это хороший текст, его трогать не надо.<strike> и это не нужно!</strike>";
        Pattern pat = Pattern.compile("<strike>.*?</strike>");
        Matcher mach = pat.matcher(str);
        while (mach.find()) {
            int start = mach.start();
            int end = mach.end();
            System.out.println("Found match\n" + str.substring(start, end) + "\nfrom " + start + " to " + (end - 1));
        }
        System.out.println("Clean the text");
        System.out.println(mach.replaceAll(""));
    }
}
