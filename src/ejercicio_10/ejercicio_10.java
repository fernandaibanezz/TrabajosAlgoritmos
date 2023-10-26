package ejercicio_10;

import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
    	Scanner entrada = new Scanner (System.in);
    	
    	int numero,intentos=0;
    	
    	System.out.println("Ingresa un numero del 0 al 99");
    	numero = entrada.nextInt();
    	
    	int num_aleatorio = (int)(Math.random()*99);
    	
    	while(numero != num_aleatorio) {
    		
    		System.out.println("Ingresa un numero del 0 al 99");
        	numero = entrada.nextInt();
        	
        	System.out.println("La cantidad de intentos es de: " +intentos);
        	
        	intentos++;
    	}    		 
    	if (numero==num_aleatorio) {
    	 System.out.println("Ganaste");
    	}	
    	}
}
	

