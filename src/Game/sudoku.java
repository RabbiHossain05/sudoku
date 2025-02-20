package Game;

import java.io.*;
import java.util.*;


public class sudoku {

        public static boolean verificaVittoria(int[][] board) {
            return !verificaErrori(board);
        }

    public static boolean verificaErrori(int[][] board) {
        return !(checkRigheEColonne(board) && checkQuadrati(board));
    }

    private static boolean checkRigheEColonne(int[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!checkUnicita(board[i])) return false;

            int[] colonna = new int[9];
            for (int j = 0; j < 9; j++) {
                colonna[j] = board[j][i];
            }
            if (!checkUnicita(colonna)) return false;
        }
        return true;
    }

        private static boolean checkQuadrati(int[][] board) {
            for (int row = 0; row < 9; row += 3) {
                for (int col = 0; col < 9; col += 3) {
                    int[] quadrato = new int[9];
                    int index = 0;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            quadrato[index++] = board[row + i][col + j];
                        }
                    }
                    if (!checkUnicita(quadrato)) return false;
                }
            }
            return true;
        }

        private static boolean checkUnicita(int[] numeri) {
            boolean[] visti = new boolean[9];
            for (int num : numeri) {
                if (num < 1 || num > 9 || visti[num - 1]) return false;
                visti[num - 1] = true;
            }
            return true;
        }

        public static void main(String[] args) {

        }
    }


