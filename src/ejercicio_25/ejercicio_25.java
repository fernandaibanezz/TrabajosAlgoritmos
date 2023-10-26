package ejercicio_25;

import java.util.Scanner;

public class ejercicio_25 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int numero, intentos = 0;
		boolean cant_intentos = false;

		System.out.println("Ingresa un numero del 0 al 99");
		numero = datos.nextInt();

		int num_aleatorio = (int) (Math.random() * 99);

		while (numero != num_aleatorio && cant_intentos == false) {
			intentos++;
			System.out.println("Incorrecto.La cantidad de intentos es de:  " + intentos);

			System.out.println("Ingrese nuevamente un numero: ");
			numero = datos.nextInt();

			if (numero == num_aleatorio) {
				System.out.println("Ganaste");
			} else if (intentos == 5) {
				cant_intentos = true;

			}
		}
		if (cant_intentos == true) {
			System.out.println("Perdiste. Cant. de intentos: " + intentos);
			System.out.println("El numero correcto es: "+num_aleatorio);
		}

	}
}
