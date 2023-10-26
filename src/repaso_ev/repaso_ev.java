package repaso_ev;

import java.util.Scanner;

public class repaso_ev {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int lim, dni_encontrado;
		boolean busqueda = false;

		System.out.println("ingrese el limite deseado: ");
		lim = entrada.nextInt();

		int[] DNI = new int[lim];
		String[] Apellidos = new String[lim];

		for (int i = 0; i < DNI.length; i++) {
			System.out.println("ingrese el DNI");
			DNI[i] = entrada.nextInt();
		}

		// ordenar lista
		for (int i = 0; i < (DNI.length - 1); i++) {
			for (int j = 0; j < (DNI.length - i - 1); j++) {

				if (DNI[j] > DNI[j + 1]) {

					int temporal = DNI[j];

					DNI[j] = DNI[j + 1];

					DNI[j + 1] = temporal;

				}
				System.out.println("\nArreglo ordenado:");
				for (int num : DNI) {
					System.out.print(num + " ");

				}
			}
		}
		for (int i = 0; i < Apellidos.length; i++) {
			System.out.println("ingrese el apellido");
			Apellidos[i] = entrada.next();

		}
		System.out.println("ingresa el numero de DNI a buscar: ");
		dni_encontrado = entrada.nextInt();

		for (int i = 0; i < DNI.length; i++) {
			for (int j = 0; j < DNI.length; j++) {

				if (DNI[i] == dni_encontrado) {
					System.out.println(DNI[i] + " pertenece a: " + Apellidos[i]);
					busqueda = true;
				}

			}

		}
		if (busqueda == false) {
			System.out.println("apellido no encontrado");
		}
	}
}