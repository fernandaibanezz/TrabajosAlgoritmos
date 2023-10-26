package tp4tobim;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class tp4tobim {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		int num;
		int numRandom = random.nextInt(100)+ 1;
		int intentos = 0;

		try {
			System.out.println("ingrese un numero entero entre 1 y 100");
			num = entrada.nextInt();

			if (num < 1 || num > 100) {
				throw new ArithmeticException();
			}

			while (num != numRandom && intentos < 10) {

				if (num > numRandom) {
					System.out.println("Ingresa un numero menor");
					intentos++;
					System.out.println("Cantidad de intentos: "+ intentos);
				}
				if (num < numRandom) {

					System.out.println("Ingresa un numero mayor ");
					intentos++;
					System.out.println("Cantidad de intentos: "+ intentos);
				}

				System.out.println("ingrese un numero entero entre 1 y 100");
				num = entrada.nextInt();
			}

			if (num == numRandom) {
				System.out.println("¡Acertaste!☻");
			}
			if (intentos == 10) {
				System.out.println("Perdiste.");
			}
		} catch (ArithmeticException e) {
			System.out.println("Error. Ingreso un numero menor a 0 o mayor a 100");
		} catch (InputMismatchException e) {
			entrada.nextLine();
			System.out.println("ingreso de dato incorrecto ");
		}
	}
}