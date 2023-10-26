package ejercicio_21;

import java.util.Scanner;

public class ejercicio_21 {

	public static void main(String[] args) throws InterruptedException{
		
		int temp= 35;
		
		
		while(temp <= 100  ) {
			
			System.out.println("la temperatura a aumentado a :"+temp);
			temp+=2;
			
			Thread.sleep(20);
			
			
			if(temp == 85) {
				
				System.out.println("CUIDADO, TEMPERATURA PELIGROSA!!! "+temp);
				temp+=2;
			
				Thread.sleep(1000);
				
				
			}
			if(temp>99) {
			
			System.out.println("VALOR EXTREMO APAGANDO PC");
	
		}
		
		
	}
	
	}
}


