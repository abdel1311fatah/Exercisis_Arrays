
package exercisi1_ampliacio;

import java.util.Random;

public class Exercisi1_Ampliacio {

    public static void main(String[] args) {
        Random randomnum = new Random();
        int num [] = new int [10];
        int r1 = 0;
        for (int a = 0; a < num.length; a++) {
            num[a] = randomnum.nextInt(100);
            r1 = num[a] % 2;
            if (r1 == 0){
                System.out.println(num[a] + " es par ");
                System.out.print("\n");
            }
        }
    }
    
}
