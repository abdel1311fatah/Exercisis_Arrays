package exercisi2_arrays;

public class Exercisi2_Arrays {
    
    public static void main(String[] args) {
        int [] pares = new int [20];
        int i = 0;
        int c = 1;
        
        for (i = 0; i < pares.length; i++) {
            pares [i] = c*2;
            c++;
            System.out.println(pares[i]);
        }
    } 
}
