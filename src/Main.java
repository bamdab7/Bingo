import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Recogemos valores por pantalla
        Scanner input = new Scanner(System.in);
        Random numeroRandom = new Random();

        //creamos tablero 5x5
        int[][] tab = new int[5][5];

        //Llenamos el tablero de numeros
        for (int row = 0; row < tab.length; row++) {
            for (int col = 0; col < tab[row].length; col++) {
                tab[row][col] = numeroRandom.nextInt(15) + 1;
            }
        }

        System.out.println("Tabla de bingo:");
        for (int row = 0; row < tab.length; row++) {
            for (int col = 0; col < tab[row].length; col++) {
                System.out.print(tab[row][col] + "  ");
            }
            System.out.println();
        }

        System.out.println("Enter your numbers (1-15):");
        int[] numUsuario = new int[5];
        for (int i = 0; i < numUsuario.length; i++) {
            numUsuario[i] = input.nextInt();
        }

        // Busqueda del numero
        int numeroBingo = 0;
        for (int row = 0; row < tab.length; row++) {
            for (int col = 0; col < tab[row].length; col++) {
                for (int i = 0; i < numUsuario.length; i++) {
                    if (tab[row][col] == numUsuario[i]) {
                        numeroBingo++;
                    }
                }
            }
        }

        System.out.println("Encontraste " + numeroBingo + " numeros.");
        if (numeroBingo >= 5) {
            System.out.println("Has ganado!");
        } else {
            System.out.println("Has perdido!");
        }
    }
}
