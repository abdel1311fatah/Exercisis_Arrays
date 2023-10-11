
package exercisi13_arrays;

import java.util.Random;

public class Exercisi13_arrays {

    
    public static void main(String[] args) {
        int tb [][] = new int [10][10];
        int r1 = 0, r2 = 0;
        Random randomnum = new Random();
        for (int i = 0; i < tb.length; i++) {
            for(int j = 0; j < tb[i].length; j++) {
                r1 = j % 2;
                if (r1 == 0){
                    tb[i][j] = 1;    
                }else{
                    tb[i][j] = 0;
                }
                System.out.println(tb[i][j]); 
            }
        }
    }
    
}
