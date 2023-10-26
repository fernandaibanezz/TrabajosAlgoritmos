package ejercicio_38;

import java.util.Scanner;

public class ejercicio_38 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int clientes, cant_max = 0, cant_min = 1000, hora_max = 20, hora_min = 8;

		for (int i = 9; i <= 19; i += 2) {

			System.out.println("Ingresa la cantidad de clientes a las " + i + "hs");
			clientes = entrada.nextInt();

			if (clientes > cant_max) {
				cant_max = clientes;
				hora_max = i;
			}

			if (clientes < cant_min) {
				cant_min = clientes;
				hora_min = i;

			}

		}

		System.out.println("La cantidad maxima de clientes fue de " + cant_max + " a las " + hora_max + "hs");

		System.out.println("La cantidad minima de clientes fue de " + cant_min + " a las " + hora_min + "hs");
	}
}