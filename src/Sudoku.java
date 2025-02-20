import java.util.Arrays;

public class Sudoku {
        public static final int SIZE = 9;
        private String[][] grid;

        public Sudoku() {
            grid = new String[SIZE][SIZE];
            clearGrid();
            setDefaultValues();    }

    private void clearGrid() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    grid[i][j] = " ";            }        }    }

    private void setDefaultValues() {
            grid[0][0] = "5";
            grid[0][1] = "3";
            grid[0][4] = "7";
            grid[1][0] = "6";
            grid[1][3] = "1";
            grid[1][4] = "9";
            grid[1][5] = "5";
            grid[2][1] = "9";
            grid[2][2] = "8";
            grid[2][7] = "6";
            grid[3][0] = "8";
            grid[3][4] = "6";
            grid[3][8] = "3";
            grid[4][0] = "4";
            grid[4][3] = "8";
            grid[4][5] = "3";
            grid[4][8] = "1";
            grid[5][0] = "7";
            grid[5][4] = "2";
            grid[5][8] = "6";
            grid[6][1] = "6";
            grid[6][6] = "2";
            grid[6][7] = "8";
            grid[7][3] = "4";
            grid[7][4] = "1";
            grid[7][5] = "9";


    }    public void viewGrid() {


        for (int i = 0; i < SIZE; i++) {
            if(grid[i] == grid[0])
            {System.out.print( " | ");}
            for (int j = 0; j < SIZE; j++) {
                System.out.print(grid[i][j] + " | ");
            }
            System.out.println();
        }
        }}