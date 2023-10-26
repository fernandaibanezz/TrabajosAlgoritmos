package ejercicio_18;

import java.util.Scanner;

public class ejercicio_18 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char talle;
		
		System.out.println("Ingrese el talle que necesite");
		talle = entrada.next().charAt(0);
		
		
		switch(talle) {
		case 'S' :
			
			System.out.println("Quedan 5 remeras");
		break;
		
		case 'M':
			System.out.println("Quedan 2 remeras");
			break;
			
		case 'L':
			System.out.println("No quedan remeras con este talle");
			break;
			
		default:
			System.out.println("No existe el talle que ingreso");
			break;
		}
		
		System.out.println("Gracias por su compra");
	
	}
	
	

}
