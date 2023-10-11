package exercisi3_arrays;

import java.util.Scanner;

public class Exercisi3_Arrays {

    public static void main(String[] args) {
    Scanner lector = new Scanner (System.in);
    int [] numeros = new int [20];
    int zeros = 0, negatius = 0, positius = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escriu un numero: ");
            numeros[i] = lector.nextInt();
            if(numeros[i] > 0){
                positius++;
            }else if(numeros[i] < 0){
                negatius++;
            }else if (numeros[i] == 0) {
                zeros++;
            }
        }
        System.out.println("Hi han "+positius+ " positius , "+negatius+" negatius "+" i "+ zeros + " zeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    } 
}