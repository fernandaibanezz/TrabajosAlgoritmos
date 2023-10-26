package ejercicio_15;

import java.util.Scanner;

public class ejercicio_15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float costo_inicial,descuento,costo_final;
		
		System.out.println("Ingresar el valor de la compra: ");
		costo_inicial = entrada.nextFloat();
		
		if(costo_inicial > 15000 ) {
			
			descuento = costo_inicial * 0.10f;
			
			costo_final = costo_inicial - descuento;
			
			System.out.println("Se le aplica un descuento del 10% ");
			
			System.out.println("Tu costo final es de : "+ costo_final);
		}
		else {
			
			
			System.out.println("tu costo final es de : "+ costo_inicial);
		}
		
		
	}

}
