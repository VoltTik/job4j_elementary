package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board[row].length - 1; i++) {
            if (board[row][i] != board[row][i + 1]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean rsl = true;
        for (int i = 0; i < board.length - 1; i++) {
            if (board[i][column] != board[i + 1][column]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
