package ejercicio_46;

import java.util.Scanner;

public class ejercicio_46 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numingresado;

		int[] socios = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };
		String[] nombres = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };

		for (int i = 0; i < 7; i++) {
			if (socios[i] % 2 == 1) {
				continue;
			}
			System.out.println("Los numeros de socio impares son:" + socios[i]);
		}
	}
}
