package ejercicio_24;

import java.util.Scanner;

public class ejercicio_24 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		char respuesta;

		boolean respuesta_papa = false;

		System.out.println("¿puedo salir?");
		respuesta = datos.next().charAt(0);

		while (respuesta_papa == false) {
			System.out.println("¿puedo salir?");
			respuesta = datos.next().charAt(0);

			if (respuesta == 'S') {
				respuesta_papa = true;
				
				System.out.println("Fin del programa :D");
			} else if (respuesta == 'N') {
				respuesta_papa = false;
				System.out.println("¿puedo salir?");
				respuesta = datos.next().charAt(0);
				
			} else {
				System.out.println("Respuesta no valida");
				
				System.out.println("¿puedo salir?");
				respuesta = datos.next().charAt(0);
			}
		}
		

	}
}