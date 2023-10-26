package Caldias;

import java.util.Scanner;

public class Caldias {
	
	public static void main (String args []) {
		Scanner entrada = new Scanner (System.in);
		
		int año,meses,semanas,dias;
		
		System.out.println("ingrese los años");
		año=entrada.nextInt();
		
	
		dias=año*365;
		meses=año*12;
		semanas=año*52;
		
		System.out.println("El año tiene:"+dias);
		System.out.println("El año tiene:"+meses);
		System.out.println("El año tiene:"+semanas);
				
		
		
		
		
}
}