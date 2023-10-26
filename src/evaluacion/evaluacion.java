package evaluacion;

import java.util.Scanner;

public class evaluacion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] legajo = new int[5];
		String[] apellido = new String[5];
		int[] calificacion = new int[5];
		int nota_max = 0, nota_min = 100, prom = 0;
		String alum_max = "", alum_min = "";

		// ingresar el numero de legajo
		for (int i = 0; i < legajo.length ; i++) {
			System.out.println("Ingresar el numero de legajo del estudiante: ");
			legajo[i] = entrada.nextInt();
		}
		// ordenar los legajos
		for (int i = 0; i < legajo.length ; i++) {
			for (int j = 0; j < legajo.length - i - 1; j++) {
				if (legajo[j] > legajo[j + 1]) {
					int temporal = legajo[j];
					legajo[j] = legajo[j + 1];
					legajo[j + 1] = temporal;
				}
			}
		}
		// Mostrar los legajos ordenados
		System.out.println("Legajo ordenado:");
		for (int ord : legajo) {
			System.out.print(ord + " ");
			System.out.println("");
		}
		// Ingresar los apellidos de los estudiantes
		for (int i = 0; i < apellido.length; i++) {
			System.out.println("Ingresar el apellido del estudiante: ");
			apellido[i] = entrada.next();
		}
		// Ingresar la calificacion del examen de ingreso
		for (int i = 0; i < calificacion.length; i++) {
			System.out.println("Ingresar la calificacion del examen de ingreso: ");
			calificacion[i] = entrada.nextInt();
			
			// calcular la calificacion maxima y minima
			if (calificacion[i] > nota_max) {
				nota_max = calificacion[i];
				alum_max = apellido[i];
			}
			if (calificacion[i] < nota_min) {
				nota_min = calificacion[i];
				alum_min = apellido[i];
			}
			// calcular el promedio
			prom += calificacion[i];
			prom = prom / 5;
		}
		// Mostrar los valores
		System.out.println("\nLista ordenada:");
		for (String estudiante : apellido) {
			System.out.print(estudiante + " ");
			System.out.println("");
		}
		System.out.println("El numero de lagajo de cada estudiante es: ");
		for (int num : legajo) {
			System.out.print(num + " ");
			System.out.println("");
		}
		System.out.println("La calificacion de cada estudiante es: ");
		for (int cal : calificacion) {
			System.out.print(cal + " ");
			System.out.println("");
		}
		System.out.println("La calificacion mas alta fue de: " + nota_max + " y pertenece a " + alum_max);
		System.out.println("La calificaion mas baja fue de: " + nota_min + " y pertenece a " + alum_min);
		System.out.println("");
		System.out.println("El promedio de los examanes es de: "+ prom);
	}
}