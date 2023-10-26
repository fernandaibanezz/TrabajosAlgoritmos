package ejercicio_36;

import java.util.Scanner;

public class ejercicio_36 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float ingreso, ingreso_total = 0, ingreso_min = 100000, ingreso_max = 0;

		int i, hora_max = 7, hora_min = 18;

		for (i = 8; i < 17; i++) {

			System.out.println("Ingresar el ingreso a las " + i + "hs : ");
			ingreso = entrada.nextFloat();

			if (ingreso > ingreso_max) {
				ingreso_max = ingreso;
				hora_max = i;

			}
			if (ingreso < ingreso_min) {
				ingreso_min = ingreso;
				hora_min = i;

			}
			ingreso_total += ingreso;

		}

		System.out.println("el ingreso mayor fue a las " + hora_max + "hs y fue de :" + ingreso_max);
		System.out.println("el ingreso menor fue a las " + hora_min + "hs y fue de :" + ingreso_min);

		System.out.println("el ingreso total es de: " + ingreso_total);

	}
}