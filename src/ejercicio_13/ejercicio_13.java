package ejercicio_13;

import java.util.Scanner;

public class ejercicio_13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		char talles, m, l;

		System.out.println("Ingresar los talles que necesite: ");
		talles = entrada.next().charAt(0);

		if (talles == 's') {

			System.out.println("Queda 5 remeras con este talle");
		}  if (talles == 'm') {

			System.out.println("Quedan 2 remeras con ese talle");
		} if (talles=='l'){
			
			System.out.println("No quedan remeras con este talle");
		}
	}
}
