package ejercicio_56;

import java.util.Scanner;

public class ejercicio_56 {

	static String apellido, nom;

	static float asis, clas_t, por;

	public static void Nombre(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresar su nombre: ");
		nom = entrada.next();
		
		System.out.println("Ingrese su apellido");
		apellido= entrada.next();
		
	}

	public static float porcentajeAsistencias (float asis, float clas_t){
		float por;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese las asistencia del alumno");
		asis = entrada.nextFloat();
		
		System.out.println("engrese la cantidad de clases");
		clas_t = entrada.nextFloat();
		
	
	por = (asis / clas_t) * 100;
	return por;
	
}
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Nombre();
	
		System.out.println("el porcentaje total es de : " +porcentajeAsistencias(asis, clas_t));

	}
	
}
