package ejercicio_59;

import java.util.Scanner;

public class ejercicio_59 {

	 static int a;
	 static int numeroMax = 0, numeroMin = 10000;

	public static void valores() {
		Scanner entrada = new Scanner(System.in);
	
		for (int i = 0; i < 3; i++) {

			System.out.println("Ingresar el numero");
			a = entrada.nextInt();

			if (a > numeroMax) {
				numeroMax = a;
			} else {
				numeroMin = a;

			}
		}
	}

	public static void main(String[] args) {
		valores();
		
		System.out.println("El numero maximo es: "+ numeroMax);
		
		System.out.println("El numero minimo es: "+ numeroMin);
	}
}