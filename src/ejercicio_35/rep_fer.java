package ejercicio_35;

import java.util.Scanner;

public class rep_fer {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
   int calificacion=20;
	int nota, nota_max=0 , nota_min=10,promedio=0;	
		
		
		for(int i=0 ; i <4; i++) {
			
			System.out.println("ingrese la nota de un alumno");
			calificacion = entrada.nextInt();
			
			if(calificacion > nota_max) {
		
				nota_max=calificacion;
						
		}
			if(calificacion<nota_max) {
			
			nota_min=calificacion;
			
		}
		}
		System.out.println("la nota maxima es de "+nota_max);
		
		System.out.println("la nota minima es de "+nota_min);
		
		promedio+=calificacion;
		
		
}
}