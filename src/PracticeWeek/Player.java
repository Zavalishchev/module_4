package PracticeWeek;

public class Player {
    public String surname;
    public String name;
    public String address;
    public String cardNumber;

    public Player(String surname, String name, String address, String cardNumber) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }
     public String toString() {
        return ("Player: name: "+ name + ", surname: " + surname + ", address: " + address + ", card number: " + cardNumber);
     }

    public static void main(String[] args) {
        Player player = new Player("Zavalishchev", "Andrei", "Luxembourg", "123");
        System.out.println(player.toString());
    }
}
