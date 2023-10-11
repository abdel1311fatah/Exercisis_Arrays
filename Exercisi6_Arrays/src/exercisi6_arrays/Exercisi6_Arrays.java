
package exercisi6_arrays;

import java.util.Random;


public class Exercisi6_Arrays {
    
    public static void main(String[] args) {
        int array [] = new int [20];
        Random randomnum = new Random();
        for (int a = 0; a < array.length; a++){
            array[a] = randomnum.nextInt(85);
        }
        for (int a= 0; a < array.length; a++){
            if (array[a]>30){
                System.out.println(array[a] + " " + a);
            }
        }
    }
}
                                                            