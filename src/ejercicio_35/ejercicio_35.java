package ejercicio_35;

import java.util.Scanner;

public class ejercicio_35 {

	
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		int n1,nota_max=0,nota_min=10,prom=0;
		
		for(int i=0; i<=4; i++) {
			
			System.out.println("Ingresar la nota del alumno: ");
			n1 = entrada.nextInt();
		
				
			if( n1 > nota_max  ) {
				nota_max=n1;	
			}
			if(n1 < nota_min ) {
			 nota_min=n1;
			}
			
			System.out.println("la nota más alta es de :"+nota_max);
			
			System.out.println("la nos más baja es de :"+nota_min);
			
			prom += n1;
			
			}
		prom=prom/5;
		
		System.out.println("El promedio del alumno es: "+ prom);
			
		}
		
		
	}