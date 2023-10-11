
package exercisi5_ampliacio;

import java.util.Scanner;


public class Exercisi5_Ampliacio {
    public static void main(String[] args) {
        int filas = 5, columnas = 5;
        int[][] tb = new int[filas][columnas];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la fila " + (i + 1) + " y columna " + (j + 1) + ": ");
                tb[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tb[i][j] + " ");
            }
            System.out.println();
        }
    }
}