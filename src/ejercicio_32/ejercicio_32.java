package ejercicio_32;

import java.util.Scanner;

public class ejercicio_32 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num,result,i;
		
		System.out.println("ingresa el numero a muliplicar: ");
		num = entrada.nextInt();
		
		for(i=0; i<=20; i++) {
			result = num*i;
			
			System.out.println(num + "*" + i +"=" + result);
		}
	}
}
