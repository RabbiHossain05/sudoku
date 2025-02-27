import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int xCoordinate = 0;
        int yCoordinate = 0;
        Scanner sc = new Scanner(System.in);
        String[][] grid;
        final int SIZE = 9;
        grid = new String[SIZE][SIZE];
        Sudoku sudoku = new Sudoku();
        System.out.println("BENVENUTO CARO PARTECIPANTE AL GIOCO DEL SUDOKU");

        int choice = 0;
        do {

            choice = menu(sc);
          switch(choice){
              case 1:
                  sudoku.viewGrid();
                  break;
              case 2:
                  //bot
                  break;
              case 3:
                  sc.nextLine();
                  System.out.println("Inserisci il numero che vuoi inserire: ");
                  String numberChosenByUser = sc.nextLine();

                  System.out.println("Inserisci il valore della coordinata X: ");
                  xCoordinate = sc.nextInt();

                  System.out.println("Inserisci la lettera della coordinata Y: ");
                  yCoordinate = sc.nextInt();

                  sudoku.insertNumber(numberChosenByUser, xCoordinate, yCoordinate);
                  sudoku.viewGrid();
                  break;
              case 4:
                  System.out.println("Inserisci il valore della coordinata X: ");
                  xCoordinate = sc.nextInt();

                  System.out.println("Inserisci il valore della coordinata Y: ");
                  yCoordinate = sc.nextInt();

                  sudoku.removeNumber(xCoordinate, yCoordinate);
                  sudoku.viewGrid();
                  break;
              case 5:
                  //errori
                  break;
              case 6:
                  //vittoria
                  break;
              case 7:
                  sudoku.restart();
                  break;
              case 8:
                  System.out.println("Uscita...");
                  break;
              default:
                  System.out.println("Uscita...");
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
    }

