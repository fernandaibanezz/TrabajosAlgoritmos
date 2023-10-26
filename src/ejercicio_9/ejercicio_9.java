package ejercicio_9;

import java.util.Scanner;

public class ejercicio_9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String nombr,apellido;
		
		System.out.println("ingrese su nombre");
		nombr = entrada.next();
		
		System.out.println("ingresae su apellido");
		apellido = entrada.next();
		
		int numeroAleatorio = (int)(Math.random()*99);
		
		System.out.println("Tu nombre es: "+ nombr);
		System.out.println("Tu apellido es: "+apellido);
		System.out.println("El numero que te toco es: "+ numeroAleatorio);
	}

}
