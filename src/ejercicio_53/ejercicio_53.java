package ejercicio_53;

import java.util.Scanner;

public class ejercicio_53 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String apellidos[][] = { { "Fraticelli", "Ibanez", "Calcinas" }, { "Martino", "Bonilla", "Ugarte" } };
		String apellido_encontrado;
		boolean busqueda = false;
		
		System.out.println("Ingresar el apellido a buscar: ");
		apellido_encontrado = entrada.next();
		
		for (int i = 0; i < apellidos.length; i++) {
			for (int j = 0; j < apellidos[i].length; j++) {

				

				if (apellidos[i][j].equalsIgnoreCase(apellido_encontrado)) {
					System.out.println("Apellido encontrado");
					 busqueda = true;
					 
				} 
				
				
			}

		}
		if(busqueda == false) {
			System.out.println("apellido no encontrado");
		}
	}
}