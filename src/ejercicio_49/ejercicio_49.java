package ejercicio_49;

import java.util.Scanner;

public class ejercicio_49 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] dni = new int [4];

		for (int i = 0; i < (dni.length); i++) {

			System.out.println("Ingresa un número de DNI");
			dni[i] = entrada.nextInt();

		}
		for (int i = 0; i < (dni.length); i++) {
			for (int t = 0; t < (dni.length - i - 1); t++) {

				if (dni[t] > dni[t + 1]) {
					int temporal = dni[t];

					dni[t] = dni[t + 1];

					dni[t + 1] = temporal;
				}
			}
		}
		System.out.println("\nArreglo asendente:");
		for (int num : dni) {
			System.out.print(num + " ");
		}
		System.out.println("\nArreglo desendente:");
		for (int i = (dni.length - 1); i >= 0 ; i--) {
			System.out.print(dni[i] + " ");
		}

	}
}
