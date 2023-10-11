
package exercisi7_arrays;

import java.util.Random;

public class Exercisi7_arrays {

   
    public static void main(String[] args) {
        int origen [] = new int [20];
        int destino [] = new int [20];
        int r1 = 0, c1 = 0, n1 = 0;
        Random randomnum = new Random();
        for (int a = 0; a < origen.length; a++){
            origen[a] = randomnum.nextInt(85);
            r1 = origen[a] % 2;
            if ((r1==0)&&(origen[a]>25)){
                for (int a2 = 0; a2 <= a;a2++){
                    destino[a2] = origen[a];
                }
            }
        }
        for (int a = 0; a < origen.length; a++){
            System.out.println("El origen es: ");
            System.out.println(origen[a]);
            System.out.println(" i el destino es: ");
            System.out.println(destino[a]);
        }
    }
}
        