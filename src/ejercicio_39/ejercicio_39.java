package ejercicio_39;

import java.util.Scanner;

public class ejercicio_39 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String[] nombre = new String[11];
		int[] edad = new int[11];

		for (int i = 0; i <11; i++) {

			System.out.println("Ingresar el nombre del jugador");
			nombre[i] = entrada.next();

			System.out.println("ingrese la edad de jugador");
			edad[i] = entrada.nextInt();
		
	}
		for (int i = 0; i <11; i++) {
			
			System.out.println("Nombre del jugador en la posicion "+ (i+1) + ": ");
			System.out.println(nombre[i]);
			
			System.out.println("Edad de jugador en la posicion "+ (i+1) + ": ");
			System.out.println(edad[i]);	
		}
}
}