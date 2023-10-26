package tp_parte_3;

import java.util.Scanner;

public class tp_parte_3 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		char talle;
		int cant_rem,precio;
		float descuento, descuento1= 0.15f,descuento_total,costo_total,precio_total;
		
		
		System.out.println("Ingresa una letra");
		talle =  datos.next().charAt(0);
		
		switch (talle) {
		
		case 'S':
			System.out.println("Ingresar la cantidad de remeras que desea comprar");
			cant_rem = datos.nextInt();
			
			if (cant_rem > 30 ) {
				System.out.println("No hay stock");
			}
			else if (cant_rem >=15 && cant_rem <30 ) {
				precio=cant_rem*5000;
				descuento = precio* descuento1;
				costo_total= precio - descuento;
				
				System.out.println("La cantidad de remeras es:"+cant_rem);
				System.out.println("El coste total es:"+ costo_total);
			
			}else {
			costo_total=cant_rem*5000;
				
				System.out.println("El costo total es de "+ costo_total);
				System.out.println("La cantidad de remeras es de: ");
			}
			
			break;
			
		case 'M':
			System.out.println("Ingresar la cantidad de remeras que desea comprar");
			cant_rem = datos.nextInt();
			
			if(cant_rem>40) {
				System.out.println("No hay stock");
			}
			else if(cant_rem>=20 && cant_rem<40) {
				precio=cant_rem*5500;
				descuento = precio* descuento1;
				costo_total= precio - descuento;
				
			System.out.println("La cantidad de remeras es:"+cant_rem);
			System.out.println("El coste total es:"+ costo_total);
			}
			else {
				costo_total=cant_rem*5500;
				
				System.out.println("La cantidad de remeras es de:"+cant_rem);
				System.out.println("El costo total es de: "+costo_total);
			}
			
			break;
			
		case 'L':
			System.out.println("Ingresar la cantidad de remeras que desea comprar");
			cant_rem = datos.nextInt();
			
			if (cant_rem >50 ) {
				
				System.out.println("No hay stock");
			}
			else if (cant_rem>=35 && cant_rem<50) {
			
				precio=cant_rem*5500;
				descuento = precio* descuento1;
				costo_total= precio - descuento;
				
			    System.out.println("La cantidada de remeras es de " + cant_rem);
			    System.out.println("el costo total es de "+ costo_total);
			    
			}
			break;
			
			default:
				
				System.out.println("El talle que ingreso es incorrecto");
				
				break;
				
		
		}
		
		
	}	
	}
