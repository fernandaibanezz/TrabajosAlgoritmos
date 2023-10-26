package ejercicio_36;

import java.util.Scanner;

public class rep_fer {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int hora_max= 17,hora_min = 8,hora;
		int ingresos_max = 0,ingresos_min=100000,ingreso_total=0,ingreso;
		
		
		for(int i=8 ;i >=17; i++) {
			
			System.out.println("a las" +i +"se recaudó : ");
			ingreso = entrada.nextInt();
			
			if(ingreso > ingresos_max) {
				
				ingresos_max=ingreso;
				hora_max =i;
			}
			if(ingreso<ingresos_min) {
				
				ingresos_min =ingreso;
				hora_min = i;
	
				
			}

			ingresos_max += ingreso_total ;
			
		}
		
		
		
		System.out.println("en ingreso maximo es de "+ingresos_max);
		System.out.println("el ingreso minimo es de "+ingresos_min);
		
		
		System.out.println("el ingreso total es de "+ ingreso_total);
		
}
}