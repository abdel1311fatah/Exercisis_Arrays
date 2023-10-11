
package exercisi15_arrays;

public class Exercisi15_arrays {
    
    public static void main(String[] args) {
      int diagonal[][] = diagonal= new int [5][5]; 
  
        for (int i=0;i<diagonal.length;i++){
            for (int j=0;j<diagonal.length;j++){ 
                if (i == j){
                    diagonal[i][j] = 1;//Diagonal primaria
                }
                if (i+j == diagonal.length-1){
                    diagonal[i][j] = 1; //Diagonal secundaria
                }
                if (i == 4 || j == 4 || i == 0 || j == 0){
                    diagonal[i][j] = 1; // Marcos
                }
                
            }
        }
        for (int i=0;i<diagonal.length;i++){
            for (int j=0;j<diagonal.length;j++){ 
                System.out.print(" "+diagonal[i][j]);
            }
            System.out.println(" ");
            
            
        }   
    }
    
}
