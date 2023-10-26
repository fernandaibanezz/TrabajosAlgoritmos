package ejercicio_42;

import java.util.Scanner;

public class ejercicio_42 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] Nombre = { "Messi", "Maradona", "Aymar", "Gallardo", "Palermo", "Riquelme", "Vagoneta", "Eito",
				"Leybovich", "Raffo" };

		for (String Nombre_almacenados : Nombre) {

			System.out.println(Nombre_almacenados);
		}
	}

}
