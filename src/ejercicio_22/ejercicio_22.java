package ejercicio_22;

import java.util.Scanner;

public class ejercicio_22 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero, intentos = 0;

		System.out.println("Ingresa un numero del 0 al 99");
		numero = entrada.nextInt();

		int num_aleatorio = (int) (Math.random() * 99);

		while (numero != num_aleatorio) {

			intentos++;
			System.out.println("La cantidad de intentos es de: " + intentos);
			
			System.out.println("Ingresa un numero del 0 al 99");
			numero = entrada.nextInt();

		}
		if (numero == num_aleatorio) {
			System.out.println("GANASTE :D!");
		}

	}

}
