package ejercicio_47;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_47 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nom,apellido;
		int[] nota = new int [12];
		
		System.out.println("Ingresa el nombre");
		nom = entrada.next();
		
		System.out.println("Ingresa el ");
		apellido = entrada.next();
		
		
		for (int i=0 ; i <(nota.length) ; i++) {
		
		System.out.println("Ingresa tus notas");
		nota[i]= entrada.nextInt();
		}
		int[]copia_nota = nota.clone();
		
		Arrays.sort(copia_nota);
		
		for (int i=0 ; i<(copia_nota.length) ; i++) {
		System.out.println("notas ordenadas: " + copia_nota[i] );

		}
		for (int i=0 ; i<(copia_nota.length) ; i++) {
		System.out.println("notas desordenadas: " + nota[i]);
		}
	
}
}