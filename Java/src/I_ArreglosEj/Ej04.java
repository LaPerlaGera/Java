/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
package I_ArreglosEj;

public class Ej04 {

    public static void main(String[] args) {
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        System.out.println("MATRIZ A");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
                System.out.print(" "+matrizA[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("MATRIZ B - TRASPUESTA");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = matrizA[j][i];
                System.out.print(" "+matrizB[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
