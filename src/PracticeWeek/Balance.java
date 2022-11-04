package PracticeWeek;

public class Balance {
    private int l_cap;
    private int r_cap;

    public Balance() {
        this.l_cap = 0;
        this.r_cap = 0;
    }

    public void addRight(int n) { this.r_cap += n;}
    public void addLeft(int n) { this.l_cap += n;}

    public char getSituation() {
        if (l_cap > r_cap) {
            return 'L';
        } else if (l_cap < r_cap) {
            return 'R';
        } else {
            return '=';
        }
    }

    public static void main(String[] args) {
        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(15);
        System.out.println(balance.getSituation());
    }
}
