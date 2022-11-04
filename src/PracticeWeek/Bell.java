package PracticeWeek;

public class Bell {
    public String soundBell = "";
    public static int counter = 0;

    public static String sound() {
        if (counter % 2 == 0) {
            counter++;
            return "ding";
        } else {
            counter++;
            return "dong";
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(sound());
        }
    }
}
