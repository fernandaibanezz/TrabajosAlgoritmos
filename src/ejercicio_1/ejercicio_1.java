package ejercicio_1;

import java.util.Scanner;

public class ejercicio_1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String nombre,apellido;
		
		System.out.println("Ingresar nombre: ");
		nombre = entrada.next();
		
		System.out.println("Ingresar apellido: ");
		apellido = entrada.next();
		
		System.out.println("Tu nombre es: "+nombre);
		
		System.out.println("Tu apellido es: "+apellido);
		
	}

}
