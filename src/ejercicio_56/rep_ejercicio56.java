package ejercicio_56;

import java.util.Scanner;

public class rep_ejercicio56 {

static String nombre,apellido; 
static int clasesT,asis;

public static void alumno () {
	Scanner entrada =new Scanner(System.in);
	
	System.out.println("ingrese el nombre de Alumno");
	nombre = entrada.next();
	System.out.println("ingrese el apellido del alumno");
	apellido =entrada.next();
}

public static int asistencias() {
	Scanner entrada = new Scanner (System.in);
	
	
	System.out.println("ingrese la cantidad de asistencias de alumno");
	asis = entrada.nextInt();
	
	return asis;
	
}

public static int clasesTotales () {
	Scanner entrada = new Scanner (System.in);

	
	System.out.println("ingrese la cantidad de clases totales");
	clasesT = entrada.nextInt();
	

	return clasesT;
	
}
public static float porcentajeAsistencia(float asis,float clasesT) {
	Scanner entrada = new Scanner (System.in);
	
	float por;
	
	 
	 por = (asis / clasesT) *  100;
	
	 return por;
	
	
}

public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);


alumno ();
asistencias();
clasesTotales () ;
porcentajeAsistencia(asis,clasesT) ;

System.out.println("la asistencia total es de : " +porcentajeAsistencia(asis,clasesT));

}
}