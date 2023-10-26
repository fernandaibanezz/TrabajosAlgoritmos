package ejercicio_48;

import java.util.Scanner;

public class ejercico_48 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] apellido = {"Fraticelli","Ibanez","Calcinas","Sarzo"};
		String apellido_max = "";
		String apellido_min = "";

		for (int i = 0; i < 4; i++) {
			

			apellido[i].compareTo(apellido_max);

			apellido[i].compareTo(apellido_min);

			if (apellido[i].compareTo(apellido_max) > 0) {
				apellido_max = apellido[i];
				
			}else {
				apellido_min = apellido[i];

			}

		}
		System.out.println("El apellido mayor es: "+ apellido_max);
		System.out.println("El apellido menor es: "+ apellido_min);
	}
}
