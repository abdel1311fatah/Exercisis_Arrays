
package exercisi14_arrays;

public class Exercisi14_arrays {

   
    public static void main(String[] args) {
        int datos [][] = new int [10][10];
        for (int i = 0; i < datos.length; i++) {
            for(int j = 0; j < datos[i].length; j++) {
                datos[i][j] = j;
                System.out.println(datos[i][j]); 
            }
        }
    }
    
}