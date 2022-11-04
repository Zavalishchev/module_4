package PracticeWeek.Massivies;

// Этот класс должен превращать одномерный массив чисел в таблицу (двумерный массив чисел x на y).

import java.sql.Array;
import java.util.Arrays;

public class ToTable {
    public int [] data;
    public int x;
    public int y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize() {
        int start = 0;
        int[][] res = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = start; j < start + y; j++) {
                res[i][j - start] = data[j];
            }
            start += y;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] data = new int[] {1, 2, 3, 4, 5, 6};
        ToTable tTable = new ToTable(data, 3, 2);

        int[][] Arr = tTable.resize();
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
