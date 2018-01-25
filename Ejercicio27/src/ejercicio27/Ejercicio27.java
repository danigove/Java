package ejercicio27;

import java.util.Scanner;

public class Ejercicio27 {

    public static int[][] matriz;
//Petardazos por todas partes, en casa sigo
    
    public static void main(String[] args) {
        trueInicialize();
        inicializar();
    }
    public static void inicializar() {
        int[][] aux = new int[4][6];
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int fila = 0;
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                System.out.print("Introduzca el numero (" + (++contador) + "): ");
                aux[i][j] = sc.nextInt();
                //fila+=aux[i][j];

                aux[i][aux[i].length] += aux[i][j];

            }

        }
        matriz = aux;
        mostrar();
    }
    public static void trueInicialize() {
        int[][] aux = new int[4][6];
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                aux[i][j] = 0;
            }
        }

    }
    public static void mostrar() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == matriz[i].length - 1) {
                    System.out.print(matriz[i][j] + ".");
                } else {
                    System.out.print(matriz[i][j] + ", ");
                }
            }
            System.out.println("");
        }
    }
}
