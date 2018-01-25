package ejercicio31;

import java.util.Random;
import java.util.Scanner;

public class GirarMatriz {
	
	static int[][] matriz;
	static int tamanioMatriz;

	public static void main(String[] args) {
		
		// inicializamos la matriz mediante entrada por teclado
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Introduce el tamaño de la matriz cuadrada, ha de ser un entero positivo:\n");
			tamanioMatriz = entrada.nextInt();
			if (tamanioMatriz < 0) {
				System.out.println("\nEl tamaño de la matriz no puede ser negativo\n");
			}
		} while (tamanioMatriz < 0);
		
		matriz = new int[tamanioMatriz][tamanioMatriz];

		
		// Rellenamos la matriz con enteros aleatorios
		Random rd = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rd.nextInt(100);
			}
		}
		

		dibujar();

		// llamamos a el metodo girar tantas veces como anillos concentricos
		// tenga la matriz, matriz.length / 2

		for (int i = 0; i < (matriz.length / 2); i++) {

			girar(i);
		}

		dibujar();

	}

	static void girar(int inicio) {

		// "inicio" indica la esquina superior izquierda del anillo que se vá a girar y "fin" la posicion donde termina la esquina superior 
		// derecha, son esos dos datos ya podemos definir las cuatro esquinas del anillo que vamos a girar.		
		int fin = (matriz.length - 1) - inicio;

		// Esquinas de la matriz
		int superiorIzq = matriz[inicio][inicio];
		int superiorDer = matriz[inicio][fin];
		int inferiorIzq = matriz[fin][inicio];
		int inferiorDer = matriz[fin][fin];

		// Giramos la matriz
		for (int j = fin - 1; j > inicio; j--) {

			matriz[inicio][j + 1] = matriz[inicio][j];
		}

		for (int i = fin - 1; i > inicio; i--) {

			matriz[i + 1][fin] = matriz[i][fin];
		}

		for (int j = inicio; j < fin; j++) {

			matriz[fin][j] = matriz[fin][j + 1];

		}

		for (int i = inicio; i < fin; i++) {

			matriz[i][inicio] = matriz[i + 1][inicio];

		}

		// colocamos las antiguas esquinas en su posición final
		matriz[inicio][inicio + 1] = superiorIzq;
		matriz[inicio + 1][fin] = superiorDer;
		matriz[fin - 1][inicio] = inferiorIzq;
		matriz[fin][fin - 1] = inferiorDer;

	}

	// Dibuja la matriz
	private static void dibujar() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				String espacio = " ";

				if (matriz[i][j] < 10) {
					espacio = "  ";
				}

				System.out.print(" " + matriz[i][j] + espacio);
			}

			System.out.println("\n");
		}
		System.out.println();
	}
}