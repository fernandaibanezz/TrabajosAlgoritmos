package repaso_ev2;

import java.util.Scanner;

public class repaso_ev2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String propietario [] = new String [3];
		int edad [] = new int [4];
		int DNI [] = new int [4];
		
		String marca [] = {"Chevrolet", "Peugeot", "Renault"};
		String modelo [] = {"Corsa", "208", "Sandero"};
		int año_vehículo [] = {2018, 2021, 2022};
		String patente [] = { "AD178JK", "AD200RS","AD202VW"};
		
		for(int i = 0; i < propietario.length ; i++) {
			
			System.out.println("ingrese el nombre del propitario");
			 propietario[i] = entrada.next();
			 
			 System.out.println("ingrese la edad del propitario");
			 edad[i] = entrada.nextInt();
			 
			 System.out.println("ingrese el DNI del propitario");
			 DNI[i] = entrada.nextInt();
			
		}
		for(int i= 0 ;i < propietario.length ; i++) {
		
		System.out.println("el nombre del propietario es: " + propietario[i] +" su edad es: "+edad[i] + " y su DNI es: "  +DNI[i]);
		

}
		for(int i=0; i< marca.length; i++) {
		
			if(año_vehículo[i]> 2020 && edad[i]> 25) {
				System.out.println("El auto" +marca[i] + "/n" + modelo[i] + "del año " + año_vehículo[i]+ ", patente " + patente[i]+ ", pertenece a " + propietario[i] + ", que tiene "+ edad[i]+ " años, y su DNI es "+ DNI[i]);
				
			}
		}
}
}