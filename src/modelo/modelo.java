package modelo;

import java.util.Scanner;

public class modelo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] sanguche = new int[4];
		int cant_max = 11111110, cant_min = 0, produccion = 0, horas = 8;

		for (int i = 0; i < sanguche.length; i++) {

			System.out.println("a las " + horas + " se vendió");
			sanguche[i] = entrada.nextInt();
			horas += 2;

			if (sanguche[i] < cant_max) {

				cant_max = sanguche[i];

			}
			if (cant_min > sanguche[i]) {

				cant_min = sanguche[i];
			}

		}
		System.out.println("la cantidad minima es de " + cant_min);
		System.out.println("la cantidad maxima es de " + cant_max);

	}

}
