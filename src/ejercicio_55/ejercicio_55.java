package ejercicio_55;

import java.util.Scanner;

public class ejercicio_55 {

	static float num;

	public static float IngresarNum() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresar un numero floante: ");
		num = entrada.nextFloat();
		return num;
	}

	public static float alCuadrado(float potencia) {
		potencia = num * num;
		return potencia;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		IngresarNum();
		alCuadrado(num);
		System.out.println(" el resultado es: " + alCuadrado(num));;
	}

}