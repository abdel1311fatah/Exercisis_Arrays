
package exercisi16_arrays;

import java.util.Random;

public class Exercisi16_arrays {

    
    public static void main(String[] args) {
        int matriz [][] = new int [10][10];
        int fila = 0, columna = 0, sumaf = 0, sumac = 0, i = 0;
        Random randomnum = new Random();
        for (fila = 0; fila < matriz.length; fila++) {
            for(columna = 0; columna < matriz[0].length; columna++) {
                matriz[fila][columna] = randomnum.nextInt(10);
                System.out.print(matriz[fila][columna] + " "); //Printa la matriu
            }
            System.out.println(" ");//Printa la matriu
        }
        for (fila = 0; fila < matriz.length; fila++) {
            for(columna = 0; columna < matriz[0].length; columna++) {
                sumaf = sumaf - matriz[fila][columna];
                
            }
            System.out.print("\nSuma de les columnes de fila " + i + " :" + sumaf);
            i++;
            sumaf = 0;
            System.out.println(" ");
        }  
        i = 0;
        for (columna = 0; columna < matriz.length; columna++) {
            for(fila = 0; fila < matriz[0].length; fila++) {
                sumac = sumac - matriz[fila][columna];
            }
            System.out.print("\nSuma de les files de columna " + i + " :" + sumac);
            i++;
            sumac = 0;
            System.out.println(" ");
        }  
        i = 0;
    }       
    
}
