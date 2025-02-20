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

            return true;
        }

        private static boolean checkUnicita(int[] numeri) {

            return true;
        }

        public static void main(String[] args) {

        }
    }


