
package exercisi11_arrays;

import java.util.Random;

public class Exercisi11_arrays {

    public static void main(String[] args) {
        int numero [] = new int [20];
        int major = 0, repetit = 0;
        Random randomnum = new Random();
        for (int a = 0; a < numero.length; a++){
            numero[a] = randomnum.nextInt(100);
            repetit = numero [a];
            if (major <= numero[a]){
                major = numero[a];
            }
        }
        for (int a = 0; a < numero.length; a++){
            System.out.println(numero[a] + " " + a);
        }
        System.out.println(" i el mes gran es: " + major);
    }
    
}
