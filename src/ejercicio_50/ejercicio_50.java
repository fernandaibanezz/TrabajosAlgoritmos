package ejercicio_50;

import java.util.Scanner;

public class ejercicio_50 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] apuesta = new int[4];

		int apuesta_max = 0, apuesta_min = 99999;

		for (int i = 0; i < (apuesta.length); i++) {
			System.out.println("Ingresar la cantidad de dinero a apostar");
			apuesta[i] = entrada.nextInt();
			if(apuesta[i] < 500) {
				
				System.out.println("valor descartado.");}
				
			if (apuesta[i] > apuesta_max) {
				apuesta_max = apuesta[i];
			}
			if (apuesta[i] < apuesta_min) {
				apuesta_min = apuesta[i];
			}

		}
		for (int l = 0; l < (apuesta.length - 1); l++) {
			for (int j = 0; j < (apuesta.length - l - 1); j++) {

				if (apuesta[j] > apuesta[j + 1]) {

					int temporal = apuesta[j];
					apuesta[j] = apuesta[j + 1];
					apuesta[j + 1] = temporal;
				}
			}

		}
		System.out.println("\nArreglo ordenado ascendentemente:");
		for (int num : apuesta) {
			System.out.print(num + " ");

		}
	}
}
