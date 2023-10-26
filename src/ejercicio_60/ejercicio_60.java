package ejercicio_60;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_60 {

	static String nom, apellido;

	public static void Alumnos() {
		Scanner entrada = new Scanner(System.in);
		int[] nota = new int[12];

		System.out.println("Ingresa el nombre");
		nom = entrada.next();

		System.out.println("Ingresa el apellido ");
		apellido = entrada.next();
	}

	public static void Notas() {
		Scanner entrada = new Scanner(System.in);

		int[] nota = new int [12];
		
		for (int i = 0; i < (nota.length); i++) {

			System.out.println("Ingresa tus notas");
			nota[i] = entrada.nextInt();
		}
		int[] copia_nota = nota.clone();

		Arrays.sort(copia_nota);

		for (int i = 0; i < (copia_nota.length); i++) {
			System.out.println("notas ordenadas: " + copia_nota[i]);
			System.out.println();

		}
		System.out.println();
		
		for (int i = 0; i < (copia_nota.length); i++) {
			System.out.println("notas desordenadas: " + nota[i]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		Alumnos();
		Notas();
		

	}
}
