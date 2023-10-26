package ejercicio_34;

import java.util.Scanner;

public class ejercicio_34 {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		
		int ingresos,mes = 0;
		
		
		for(int i=1 ;i<=12; i++) {
			
			mes++;
			
			System.out.println("Ingresos del mes: "+ mes);
			ingresos = entrada.nextInt();
			
			if(ingresos<100000) {
			
				System.out.println("Hubo un ingreso menor a $100000");
				
			}
			
		}

	
	
	}

}
