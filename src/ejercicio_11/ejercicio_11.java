package ejercicio_11;

import java.util.Scanner;

public class ejercicio_11 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int var;
		
		System.out.println("ingrese un número positivo u negativo" );
		var = entrada.nextInt();
		
		if (var > 0 ) {
			
			System.out.println("el número es positivo");
	
		}
		else if (var < 0) {
			
			
			System.out.println("el número es negativo");
			
		}
		else {
			
			System.out.println("el número es 0");
			
	}

}
}