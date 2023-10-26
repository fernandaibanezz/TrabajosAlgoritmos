package ejercicio_6;

import java.util.Scanner;

public class ejercicio_6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		float numero;
		
	System.out.println("Ingresa tu nota con decimales");
	numero = entrada.nextFloat();
	
	float numRedondeado = (float) Math.round(numero);
		
	System.out.println("Tu nota es : " +numRedondeado);
		
	}	
}
