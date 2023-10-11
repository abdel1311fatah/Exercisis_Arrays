
package exercisi8_arrays;
import java.util.Random;

public class Exercisi8_arrays {

    
    public static void main(String[] args) {
        float notes [] = new float [10];
        Random randomnum = new Random();
        int mitjana = 0, suma_notes = 0;
        for (int a = 0; a < notes.length; a++){
            notes[a] = randomnum.nextInt(10);
            suma_notes += notes[a];
            if (a == 9){
              mitjana = suma_notes % a; 
            }
        }
        
        for (int a= 0; a < notes.length; a++){
            System.out.println("Les notes de l' alumne son: ");
            System.out.println(notes[a]);
        }
         System.out.println(" I la seva mitjana de notes es: " + mitjana);
    }
    
}
