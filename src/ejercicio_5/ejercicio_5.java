package ejercicio_5;

import java.util.Scanner;

public class ejercicio_5 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		float num;
		
		System.out.println("Ingresa un número:");
		num = entrada.nextFloat();
		
		float resultado = (float)Math.sqrt(num);		
        int resultado2 = (int)Math.sqrt(num);
		
        System.out.println("El valor de la raiz con float: "+resultado);
        System.out.println("El valor de la raiz con int: "+resultado2);
		
	}
	
	
	

}
