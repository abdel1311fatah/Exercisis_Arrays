package exercisi1_arrays;

public class Exercisi1_Arrays {

    public static void main(String[] args) {
int[][] tabla = new int[10][10];
for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++) {
        tabla[i][j] = i + 1;
    }
}
for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++) {
        System.out.println(tabla[i][j]);
    }
    }
}
}
    