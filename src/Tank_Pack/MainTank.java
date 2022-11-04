package Tank_Pack;

public class MainTank {
    public static void main(String[] args) {
        Tank justTank = new Tank();
        Tank anyWhere = new Tank(10, 10);
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();

        anyWhere.goBackward(-200);
        anyWhere.printPosition();

        customTank.goForward(201);
        customTank.printPosition();
    }
}
