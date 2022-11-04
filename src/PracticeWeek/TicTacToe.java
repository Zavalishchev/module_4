package PracticeWeek;

public class TicTacToe {
    public String[][] field;
    public String nowPlayer;

    public TicTacToe() {
        newGame();
    }

    public void newGame() {
        field = new String[][] {
                {"-", "-", "-"},
                {"-", "-", "-"},
                {"-", "-", "-"}
        };
        nowPlayer = "X";
    }

    public String[][] getField() {
        return field;
    }

    public String makeMove(int x, int y) {
        x -= 1;
        y -= 1;

        String check = this.checkGame();

        if (check != null) return "Game was ended";

        if (!field[x][y].equals("-")) return "Cell " + x + ", " + y + " is occupied";

        field[x][y] = nowPlayer;
        check = checkGame();

        if (check != null) {
            if (check.equals("X")) return "X won";
            else if(check.equals("0")) return "0 won";
            else return "Draw";
        }

        nowPlayer = nowPlayer.equals("X") ? "0" : "X";
        return "Move complete";
    }

    public String checkGame() {
        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals("0") || field[i][j].equals("-")) check = false;
            }
            if (check) return "X";
        }

        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals("X") || field[i][j].equals("-")) check = false;
            }
            if (check) return "0";
        }

        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (field[j][i].equals("0") || field[j][i].equals("-")) check = false;
            }
            if (check) return "X";
        }

        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (field[j][i].equals("X") || field[j][i].equals("-")) check = false;
            }
            if (check) return "0";
        }

        String[] diag_1 = {field[0][0], field[1][1], field[2][2]};
        String[] diag_2 = {field[0][2], field[1][1], field[2][0]};

        boolean check = true;
        for (int i = 0; i < 3; i++) {
            if (diag_1[i].equals("0") || diag_1[i].equals("-")) check = false;
        }
        if (check) return "X";
        else {
            check = true;
            for (int i = 0; i < 3; i++) {
                if (diag_1[i].equals("X") || diag_1[i].equals("-")) check = false;
            }
            if (check) return "0";
        }

        check = true;
        for (int i = 0; i < 3; i++) {
            if (diag_2[i].equals("0") || diag_2[i].equals("-")) check = false;
        }
        if (check) return "X";
        else {
            check = true;
            for (int i = 0; i < 3; i++) {
                if (diag_2[i].equals("X") || diag_2[i].equals("-")) check = false;
            }
            if (check)return "0";
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals("-")) return null;
            }
        }
        return "D";
    }

    public void printField(String[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + field[i][j] + "]");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();
        board.printField(board.getField());
        System.out.println(board.makeMove(1, 1));
        board.printField(board.getField());
        System.out.println(board.makeMove(1, 1));
        System.out.println(board.makeMove(1, 2));
        board.printField(board.getField());
        System.out.println(board.makeMove(2, 1));
        System.out.println(board.makeMove(2, 2));
        System.out.println(board.makeMove(3, 1));
        System.out.println(board.makeMove(2, 2));
        board.printField(board.getField());
    }
}






