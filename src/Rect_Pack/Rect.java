package Rect_Pack;

public class Rect {
    private int w;
    private int h;

    public Rect() {
        this(10, 20);
    }
    public Rect(int w, int h) {
        this.w = w;
        this.h = h;
    }
    public int calcSquare() {
        return w * h;
    }
}
