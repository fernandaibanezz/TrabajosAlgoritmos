package ejercicio_52;

import java.util.Scanner;

public class ejercicio_52 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int ent[][] = new int[2][2];
		int neg;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				System.out.println("ingrsa un numero");
				ent[i][j] = entrada.nextInt();

				if (ent[i][j] < 0) {
					System.out.println("valor negativo");
					System.out.println("ingrese un numero");
					ent[i][j] = entrada.nextInt();
				}

			}

		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				System.out.print(ent[i][j] + " ");

				System.out.println();

			}
		}

	}
}