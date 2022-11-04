package PracticeWeek;

//Напишите класс LimitingRectangle (ограничивающий точки прямоугольник),
// класс принимает точки на плоскости и строит прямоугольник.
// Если точка лежит на границе прямоугольника, то считаем, что она в него входит.

public class LimitingRectangle {
    public int[][] points;

    public LimitingRectangle(int[][] points) {
        this.points = points;
    }
    public int min(int val) {
        int min = 1000;
        for (int i = 0; i < points.length; i++) {
            if (points[i][val] <= min) {
                min = points[i][val];
            }
        }
        return min;
    }
    public int max(int val) {
        int max = -1000;
        for (int i = 0; i < points.length; i++) {
            if (points[i][val] >= max) {
                max = points[i][val];
            }
        }
        return max;
    }
    public int getHeight() {
        return max(1) - min(1);
    }
    public int getWidht() {
        return max(0) - min(0);
    }
    public String getBorders() {
        return this.min(1) + ", " + this.max(1) + ", " + this.min(0) + ", " + this.max(0);
    }

    public static void main(String[] args) {
        int[][] points = {
                {-1, -2},
                {3, 4}
        };
        LimitingRectangle rect = new LimitingRectangle(points);
        System.out.println(rect.getBorders());
    }
}
