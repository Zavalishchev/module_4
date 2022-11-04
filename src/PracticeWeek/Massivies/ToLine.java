package PracticeWeek.Massivies;

public class ToLine {
    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }
    public int[] resize() {
        int[] res = new int[data.length * data[0].length];
        int start = 0;
        for (int[]datum : data) {
            for (int i = 0; i < datum.length; i++) {
                res[start + i] = datum[i];
            }
            start += datum.length;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][] {{1, 2}, {3, 4}, {5, 6}};
        ToLine tLine = new ToLine(arr);
        int[] tempArr = tLine.resize();
    }
}
