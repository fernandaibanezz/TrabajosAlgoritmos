package ejercicio_30;

import java.util.Scanner;

public class ejercicio_30 {
	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);

		
		for(int cant_seg=0; cant_seg <=100; cant_seg++) {
			
			
			System.out.println("la catnidad de seguidores es de : "+cant_seg);
			Thread.sleep(20);
			
			
		}
		System.out.println("Llegaste a los 100 seguidores:D!!!!!!");
	}
}
