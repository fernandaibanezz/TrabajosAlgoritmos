package ejercicio_58;

import java.util.Scanner;

public class ejercicio_58 {

	static float num;

	public static void numero() {
		System.out.println("Ingrese un numero positivo u negativo");
		Scanner entrada = new Scanner(System.in);
		num = entrada.nextFloat();
	}

	public static boolean ToF() {

		boolean comparacion = false;

		if (num > 0) {
			comparacion = true;
			System.out.println("El numero es positivo");
		} else {
			comparacion = false;
			System.out.println("El numero es negativo");
		}
		return comparacion;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		numero();
		ToF();

		System.out.println(" el numero es " + num);

	}
}