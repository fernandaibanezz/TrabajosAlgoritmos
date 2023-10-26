package ejercicio_8;

import java.util.Scanner;

public class ejercicio_8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		float numero;
		
		System.out.println("Ingresar un numero con dos decimales");
		numero = entrada.nextFloat();
		
		double base = numero, exponente = 2;
		int potencia =(int) Math.pow(base, exponente);
		
		double numeroAleatorio = (Math.random()+potencia)*7;
			
		double raiz_cuadrada = Math.sqrt(numeroAleatorio);
		
		System.out.println("El resultado es: "+ raiz_cuadrada);
	}
}
