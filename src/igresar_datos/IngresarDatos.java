package igresar_datos;

import java.util.Scanner;

public class IngresarDatos {

public static void main (String args[]) {
	
	Scanner entrada = new Scanner (System.in);
	
	String nombre1 ; 
	String nombre2 ; 
	int edad1 ;
	int edad2 ;
	
	
	System.out.println("Ingresar primer nombre");
	nombre1 = entrada.next();
	
	System.out.println("Ingresar segundo nombre");
	nombre2 = entrada.next();
	
	
	System.out.println("tu nombre es: "+nombre1);
	
	System.out.println("tu nombre es: "+nombre2);
	
	
	
	System.out.println("Ingresar edad de: "+nombre1);
	edad1 = entrada.nextInt();
	
	System.out.println("Ingresar edad de: "+nombre2);
	edad2 = entrada.nextInt();
	
	
	System.out.println("La edad1 es: "+edad1);
	
	System.out.println("La edad2 es: "+edad2);
	
	}
}

