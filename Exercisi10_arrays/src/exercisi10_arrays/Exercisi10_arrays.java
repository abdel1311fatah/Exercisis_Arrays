
package exercisi10_arrays;
import java.util.Random;

public class Exercisi10_arrays {
    
    public static void main(String[] args) {
        int positivos [] = new int [10];
        int negativos [] = new int [10];
        int nulos [] = new int [10];
        Random randomnum = new Random();
        for (int a = 0; a < positivos.length; a++){
            positivos[a] = randomnum.nextInt(100);
        }
        for (int a = 0; a < negativos.length; a++){
            negativos[a] = randomnum.nextInt(100);
            negativos[a] = negativos[a]* (-1);
        }
        for (int a = 0; a < nulos.length; a++){
            nulos[a] = 0;
        }
        for (int a = 0; a < positivos.length; a++){
            System.out.println("Els positius son: ");
            System.out.println(positivos[a]);
            System.out.println(" els negatius son: ");
            System.out.println(negativos[a]);
            System.out.println(" i els zeros o nuls son: ");
            System.out.println(nulos[a]);
        }
    } 
}
