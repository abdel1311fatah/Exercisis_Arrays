
package exercisi6_ampliacio;

import java.util.Random;


public class Exercisi6_Ampliacio {

    
    public static void main(String[] args) {
        Random randomnum = new Random();
        int num [] = new int [10];
        int suma = 0;
        for(int a = 0; a < num.length; a++){
            num[a] = randomnum.nextInt(10);
            suma += num[a];
        }
        System.out.println("La suma es: "+ suma);
    }
    
}
