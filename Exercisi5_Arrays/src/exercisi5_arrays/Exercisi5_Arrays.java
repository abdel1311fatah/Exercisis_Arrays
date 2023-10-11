package exercisi5_arrays;

import java.util.Random;
import java.util.Scanner;

public class Exercisi5_Arrays {

    
    public static void main(String[] args) {
        int vector [] = new int [20];
        int c1 = 0, resultat = 0;
        Scanner lector = new Scanner (System.in);
        Random randomnum = new Random();
        for (int a = 0; a < vector.length; a++){
            vector[a] = randomnum.nextInt(85);
        }
        System.out.println("Quants numeros vols sumar? ");
        c1 = lector.nextInt();
        for (int a = 0; a <= c1; a++){
            resultat += vector[a];
        }
        System.out.println("El resultat es: " + resultat); 
    }
}
           