package ejercicio_23;

import java.util.Scanner;

public class ejercicio_23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1,n2,resultado_suma,opc;
		
		System.out.println("ingresar 1 numero:");
		n1 = entrada.nextInt();
		
		System.out.println("Ingresar el numero 2");
		n2 = entrada.nextInt();
		
		resultado_suma= n1+n2;
		
		System.out.println("el reusultado de la suma es de: "+resultado_suma);
		
		System.out.println("ingrese cualquier numero, en caso que quiera salir ingrese el 0");
		opc = entrada.nextInt();
		
		
		while(opc != 0 ) {
		
			System.out.println("ingresar 1 numeros:");
			n1 = entrada.nextInt();
			
			System.out.println("Ingresar el numero 2");
			n2 = entrada.nextInt();
			
			resultado_suma= n1+n2;
			
			System.out.println("el reusultado de la suma es de: "+resultado_suma);
			
			System.out.println("ingrese cualquier numero, en caso que quiera salir ingrese el 0");
			opc = entrada.nextInt();
			
		}
		
		
		
	}
}
