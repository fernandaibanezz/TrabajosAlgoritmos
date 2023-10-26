package ejercicio_16;

import java.util.Scanner;

public class ejercicio_16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int horas,minutos,segundos;
		
		System.out.println("Ingresa un hora: ");
		horas = entrada.nextInt();
		
		System.out.println("Ingresa un cantidad de minutos: ");
		minutos = entrada.nextInt();
		
		System.out.println("Ingresa un cantidad de segundos: ");
		segundos = entrada.nextInt();
		
		if(horas < 24) {
			
			System.out.println("la hora ingresada es correcta");
			
		}
		else {
			
	      System.out.println("la hora ingresada es incorrecta");
	}
		if (minutos < 60) {
			 System.out.println("los minutos nos correctos");
		}
		else {
			System.out.println("los minutos son incorrectos");
			
		} 
		if (segundos < 60 ) {
			
			System.out.println("los segundos son correctos");
			
		}else {
			
			System.out.println("los segundos son incorrectos");
		}
			
			
	}
			 
			 
			 
			 
		
}
