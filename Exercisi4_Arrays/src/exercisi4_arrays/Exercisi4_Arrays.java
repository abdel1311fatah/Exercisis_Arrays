package exercisi4_arrays;

import java.util.Scanner;


public class Exercisi4_Arrays {
    
    public static void main(String[] args) {
        int [] tabla = new int [15];
        int positius = 0,r = 0, pares = 0;
        Scanner lector = new Scanner (System.in);
        for (int i = 0; i <tabla.length; i++) {
            System.out.println("Escriu un numero: ");
            tabla[i] = lector.nextInt();
            if (tabla[i] == 0){
                System.out.println("El numero entrat es 0 ");
            }else if (tabla[i]>0){
                positius++;
            }
            r = tabla[i] % 2;
            if (r == 0){
                pares++;
            }
        }
        System.out.println("Hi han "+positius+ " positius i "+pares+" pares ");
    }
    
}
