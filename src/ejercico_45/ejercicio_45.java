package ejercico_45;

import java.util.Scanner;

public class ejercicio_45 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numingresado;

		int[] socios = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };
		String[] nombres = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };

		for (int i = 0; i <= 6; i++) {

			System.out.println("Para encontrar el indivio ingrese el numero del socio");
			numingresado = entrada.nextInt();

			for (int j = 0; j <= 6; j++) {
				if (numingresado == socios[j]) {

					System.out.println("El individuo es: " + nombres[j] + "y su numero de socio es: " + socios[ j]);

				}
			}

		}
	}
}