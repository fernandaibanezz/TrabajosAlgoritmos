package ejercicio_43;

import java.util.Scanner;

public class ejercicio_43 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] numeros = new int[3];
		int num;
		
		num = (int)(Math.random()*50);
		
		
		for(int i=0; i<3; i++) {
			System.out.println("Ingresa cualquier numero");
			numeros[i] = entrada.nextInt();
		}
		if (num ==numeros[0] || num ==numeros[1] || num ==numeros[2] ) {
		
			System.out.println("GANASTE!! :P");
			
		}else {
			System.out.println("Perdiste :c");
		}
		
		
		
		
		
		
		

}
}