package Tank_Pack;

public class Tank {
    private int x, y, dir, fuel;
    private static int tankCount;
    private final String tankName = "T-34";
    private int counter;

    public Tank() {
        this(0, 0, 100);
    }
    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel){
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        tankCount++;
        counter = tankCount;
    }

    public void goForward(int i) {
        if (i < 0 && -i > fuel) {
            i = -fuel;
        } else if (i > fuel) {
            i = fuel;
        }
        if (dir == 0) {
            x += i;
        } else if (dir == 1) {
            y += i;
        } else if (dir == 2) {
            x -= i;
        } else {
            y -= i;
        }
        fuel -= Math.abs(i);
    }
    public void printPosition() {
        System.out.println("The Tank " + tankName + "-" + counter + " at the " + x + ", " + y + " position");
    }
    public void turnLeft() {
        dir--;
        if (dir == -1) {
            dir = 3;
        }
    }
    public void turnRight() {
        dir++;
        if (dir == 4) {
            dir = 0;
        }
    }
    public void goBackward(int i) {
        goForward(-i);
    }
}