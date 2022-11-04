package Plain_Pack;

public class MainPlane {
    public static void main(String[] args) {
        Plain plain = new Plain();

        plain.flyStraight(50);
        plain.flyUp(80, 90);

        plain.turnRight();
        plain.flyStraight(30);

        plain.dropBombs();
        plain.flyStraight(40);

        plain.flyDown(100, 10);
        plain.fillFuel();

        plain.flyDown(100, 10);
        plain.fillFuel();
    }
}
