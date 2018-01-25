package examen2evaluacionej2;

import java.util.Scanner;

public class Examen2EvaluacionEj2 {
        
        private static int[][] matrizA = new int[3][3];
        private static int[][] matrizB = new int[3][3];
        private static int[][] matrizC = new int[3][3];

        public static void main(String[] args) {
            inicializarMatrizA();
            inicializarMatrizB();

            mostrarMatriz(matrizTraspuesta(matrizA));
            System.out.println("");
            mostrarMatriz(multiplicar(matrizB));
            System.out.println("");
            
            
            mostrarMatriz(operacion());

        }
    
        public static void inicializarMatrizA(){
           /* int jaj = 0;
            for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizA[i].length; j++){  
                    matrizA[i][j]=++jaj;
                }
                
            }*/
           Scanner sc = new Scanner(System.in);
            for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizA[i].length; j++) {
                    System.out.print("Introduzca para la posicion " + i+j + " : ");
                    matrizA[i][j]=sc.nextInt();
                }
            }
        }
        public static void inicializarMatrizB(){
           Scanner sc = new Scanner(System.in);
            for (int i = 0; i < matrizB.length; i++) {
                for (int j = 0; j < matrizB[i].length; j++) {
                    System.out.print("Introduzca para la posicion " + i+j  + " : " );
                    matrizB[i][j]=sc.nextInt();
                }
                
            }
        }

        
        public static int[][] multiplicar(int[][] a){
            int[][] sol = new int[3][3];
            for (int i = 0; i < sol.length; i++) {
                for (int j = 0; j < sol[i].length; j++) {
                    sol[i][j] = 2 * a[i][j];
                }
                
            }
            return sol;
        }
        public static int[][] sumar(int[][] a, int[][] b){
            int[][] sol = new int[3][3];
            for (int i = 0; i < sol.length; i++) {
                for (int j = 0; j < sol[i].length; j++) {
                    sol[i][j] = a[i][j] + b[i][j];
                }
            }
            return sol;
        }
        public static int[][] operacion(){
            int[][] sol = new int[3][3];
            sol = sumar(matrizTraspuesta(matrizA),multiplicar(matrizB));
            
            
            return sol;
        }
        
        
        
        public static int[][] matrizTraspuesta(int[][] a){
            int[][] sol = new int[3][3];
            for (int i = 0; i < sol.length; i++) {
                for (int j = 0; j < sol[i].length; j++) {
                    sol[j][i] = a[i][j];
                }
            }
            
            return sol;
        }
        public static void mostrarMatriz(int[][] a){
            for (int i = 0; i < a.length; i++){
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
            
        }
}
