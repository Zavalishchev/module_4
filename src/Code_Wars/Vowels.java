package Code_Wars;

public class Vowels {

    public static int getCount(String str) {
        int counter = 0;
        for (int i = 0;i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));

    }
}
