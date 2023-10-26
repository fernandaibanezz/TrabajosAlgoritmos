package ejercicio_57;

import java.util.Scanner;

public class ejercicio_57 {

	static float numf;
	static int entero;

	public static void flotante() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero flotante");
		numf = entrada.nextFloat();

	}

	public static void entero() {
		System.out.println("ingrese el numero entero del flotante ");
		Scanner entrada = new Scanner(System.in);
		entero = entrada.nextInt();

	}

	public static float Resta(float A, int B) {

		float resta = A - B;
		return resta;

	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		flotante();
		entero();
		System.out.println("el numero fraccionario es: " + Resta(numf,entero) );

	}
}
