package Webinar;

public class Toplietz {
    private static int N, M;
    public static void main(String[] args) {
        int [][] mat = {
                {1, 2, 3},
                {4, 1, 2},
                {5, 4, 1},
                {6, 5, 4}
        };
        N = mat.length;
        M = mat[0].length;
        isToplitz(mat);

        System.out.println(isToplitz(mat));
    }

    private static boolean isToplitz(int[][] mat) {
        for (int i = 0; i < N; i++) {
            if(!checkDiagonal(mat, i, 0)) {
                return false;
            }
        }
        return true;
    }
    private static boolean checkDiagonal(int[][]mat, int i, int j) {
        int res = mat[i][j];

        while (++i < N && ++j < M) {
            if(mat[i][j] != res) {
                return false;
            }
        }
        return true;
    }
}
