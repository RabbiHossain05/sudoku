import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] grid;
        final int SIZE = 9;
        grid = new String[SIZE][SIZE];
        Sudoku sudoku = new Sudoku();
        System.out.println("BENVENUTO CARO PARTECIPANTE AL GIOCO DEL SUDOKU");

        int choice = 0;
        do {
          switch(choice = menu(sc)){
              case 1:
                  sudoku.viewGrid();
                  break;
              case 2:
                  break;
              case 3:
                  insertNumber(sc, SIZE, grid );
                  break;
              case 4:
                  break;
              case 5:
                  break;
              case 6:
                  break;
              case 7:
                  break;

              case 8:

                  break;

              default:
                  break;
          }
        }while(menu(sc) != 8 );



    }
    public static int menu(Scanner sc) {
        int userChoice = 0;
            System.out.println("1. Visualizza griglia\n" +
                    "2. Fai giocare il bot\n" +
                    "3. Inserisci un numero\n" +
                    "4. Togli un numero\n" +
                    "5. Verifica errori\n" +
                    "6. Verifica vincita\n" +
                    "7. Ricomincia\n" +
                    "8. Esci ");
            userChoice = sc.nextInt();

        return userChoice;
    }

public static void insertNumber(Scanner sc, int SIZE, String[][] grid ) {
        String numberChosenByUser = "";
        int xCoordinate = 0;
        int yCoordinate = 0;

        System.out.println("Inserisci il numero che vuoi inserire: ");
        numberChosenByUser = sc.nextLine();

        System.out.println("Inserisci il valore della coordinata X: ");
        xCoordinate = sc.nextInt();

        System.out.println("Inserisci il valore della coordinata Y: ");
        yCoordinate = sc.nextInt();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(grid[i][j]  == grid[xCoordinate][yCoordinate]) {
                    grid[i][j] = numberChosenByUser;
                }
            }
            System.out.println();
        }
    }




}