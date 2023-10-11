
package exercisi3_ampliacio;

import java.util.Random;


public class Exercisi3_Ampliacio {

    public static void main(String[] args) {
        Random randomnum = new Random();
        int num [] = new int [10];
        int mayor = 0;
        for(int a = 0; a < num.length; a++){
            num[a] = randomnum.nextInt(10);
            if(mayor <= num[a]){
                mayor=num[a];
            }
        }
        System.out.println("El mes gran es: " + mayor);
    }
    
}
