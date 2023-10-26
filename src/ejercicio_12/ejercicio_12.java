package ejercicio_12;

import java.util.Scanner;

public class ejercicio_12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int calificacion;

		System.out.println("Ingrese su calificacion");
		calificacion = entrada.nextInt();

		if (calificacion < 1 || calificacion > 10) {

			System.out.println("Ingresaste un valor incorrecto ");
		}
		else if (calificacion == 1 && calificacion >= 3) {

			System.out.println("insuficiente");

		}
		else if (calificacion > 3 && calificacion < 6) {

			System.out.println("no logrado");
		}
		else if (calificacion >= 6 && calificacion <= 7) {

			System.out.println("suficiene");
		}
		else if (calificacion >= 8 && calificacion <= 9) {

			System.out.println("notable");
		} 
		else {

			System.out.println("sobresaliente");

		}
	}
}
