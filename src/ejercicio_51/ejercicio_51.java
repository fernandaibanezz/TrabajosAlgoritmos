package ejercicio_51;

import java.util.Scanner;

public class ejercicio_51 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float[][] flot = new float[2][3];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.println("ingrse la un numero foante");
				flot[i][j] = entrada.nextFloat();
			}
		}
		// Monstrar Matriz
		for (int i = 0; i < flot.length; i++) {
			// completo filas
			for (int j = 0; j < flot[i].length; j++) {

				System.out.print(flot[i][j] + " ");
				// completo columnas
			}
			System.out.println();
		}

	}
}