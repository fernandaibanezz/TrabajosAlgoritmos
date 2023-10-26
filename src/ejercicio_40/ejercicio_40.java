package ejercicio_40;

import java.util.Scanner;

public class ejercicio_40 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float[] temperatura = new float [5];
		float prom = 0;

		for (int i = 0; i < 5; i++) {

			System.out.println("Ingresar la temperaura " + (i+1) + ":");
			temperatura[i] = entrada.nextFloat();

			prom += temperatura[i];

		}
		prom = prom / 5;

		System.out.println("El promedio de las temperauras es de: " + prom);
	}

}
