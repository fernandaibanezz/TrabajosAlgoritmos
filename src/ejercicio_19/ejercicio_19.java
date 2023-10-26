package ejercicio_19;

import java.util.Scanner;

public class ejercicio_19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numcafe;

		System.out.println("Ingrese el numero del cafe");
		numcafe = entrada.nextInt();

		switch (numcafe) {

		case 1:

			System.out.println("Es cafe cortado");
			break;

		case 2:

			System.out.println("es cafe late");
			break;

		case 3:
			System.out.println("es cafe solo");
			break;

		case 4:
			System.out.println("es cafe lagrima");
			break;

		case 5:
			System.out.println("saliste del programa");
			break;

		default:

			System.out.println("el numero de cafe que ingresaste no existe");
			break;

		}

		System.out.println("gracias por su compra");

	}
}