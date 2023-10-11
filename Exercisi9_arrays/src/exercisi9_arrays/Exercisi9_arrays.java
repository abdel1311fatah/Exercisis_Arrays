
package exercisi9_arrays;

public class Exercisi9_arrays {
        
   
    public static void main(String[] args) {
        int numeros [] = new int [15];
        int n1 = 16;
        for (int a = 0; a < numeros.length; a++){
            n1--;
            numeros[a] = n1;
        }
        for (int a= 0; a < numeros.length; a++){
            System.out.println(numeros[a]);
        }
    }
}
    

