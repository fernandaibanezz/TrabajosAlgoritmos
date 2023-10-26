package ejercicio_17;

import java.util.Scanner;

public class ejercicio_17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float num1,num2,num3;
		
		System.out.println("ingresa un numero");
		num1 = entrada.nextFloat();
		
		System.out.println("ingresa un segundo número");
		num2= entrada.nextFloat();
		
		System.out.println("ingresa un tercer número");
		num3= entrada.nextFloat();
		
		if(num1 > num2 && num2 > num3 ) {
			
			System.out.println("num1 es mayor,num2 es el segundo mayor y num3 es el menor");
		}
		if(num1 > num3 && num3 > num2) {
			
			System.out.println("num1 es el mayor,num3 es el segundo mayor y num2 es el menor");
		}
		if (num2 > num3 && num3 > num1 ) {
			
			System.out.println("num2 es el mayor,num3 es el segundo mayor y num1 es el menor");
		}
		if(num2 > num1 && num1 > num3 ) {
			
			System.out.println("num2 es el mayor,num1 es el segundo mayor y num3 es el menor");
		}
		if (num3 > num1 && num1 > num2 ) {
			
			System.out.println("num3 es el mayor,num1 es el segundo mayor y num2 es el menor");
		}
		if(num3 > num2 && num2 > num1) {
			
			System.out.println("num3 es el mayor,num2 es el segundo mayor y num1 es el menor ");
		}
		}
		
		
		
	}
