package tp_1er_bim;
/* nombre del paquete*/
import java.util.Scanner;
/*libreria del Scanner tambien es para ingresar datos*/
public class tp_1er_bim {
	public static void main(String[] args) {
		/*funcion principal*/
		Scanner datos = new Scanner(System.in);
		/*clase scanner para ingresar*/
		System.out.println("\tEste programa te permite resolver algunos problemas");
		/*"\t" sirve para centrar el texto*/
		System.out.println("\tElegí una opción: ");
		System.out.println("1. Calcular raiz cuadrada.");
		System.out.println("2. Analizar si un numero es positivo, negativo o cero.");
		System.out.println("3. Jugar al bingo.\n");/*"\n" sirve para dejar espacio entre una linea de codigo*/
       /* Sirve para mostar en pantalla*/
		
		int opc; /*declara una variable entera llamada opc*/
		opc = datos.nextInt();

		switch (opc) { /*swith analiza la variable opc*/

		case 1:
			System.out.println("Ingresa un número para calcular su raiz cuadrada: ");

			double num_raiz;/* double sirve para numero decimales*/
			num_raiz = datos.nextInt();

			if (num_raiz >= 0) {/*analiza si num_raiz es igual y mayor a 0*/
				double raiz_cuadrada =  Math.sqrt(num_raiz);/*"Math.sqrt" sirve para hacer la raiz cuadrada y num_raiz toma el valor de raiz_cuadrada*/
				System.out.println("El resultado es: " + raiz_cuadrada);
			}
			 else {/*si num_raiz no es igual y mayor a 0 ejecuta la orden dentro de else*/
				System.out.println("No se puede calcular la raiz de un negativo.");
			}

			break;/*indica el final del case 1*/
			
		case 2:
			System.out.println("Ingresa un numero: ");

			int num_signo;/*crea una variable entera llamada num_signo*/
			num_signo = datos.nextInt();

			if (num_signo == 0) {/*analiza si num_signo es igual a 0 */
				System.out.println("El numero es cero");
			} else if (num_signo > 0) {/*analiza si el num_signo es mayor a 0 es positivo */
				System.out.println("El numero es positivo");
			} else {/*si no se cumple ninguna de las condiciones anteriores va a ejecutar lo que esta dentro del else, en este caso resia un numero negativo*/
				System.out.println("El numero es negativo");
			}

			break;/*indica el final de case 2*/

		case 3:
			System.out.println("Ingresa un numero entre 0 y 9");

			double num_bingo;/*define una variable double */
			num_bingo = datos.nextInt();

			double num_ganador_double = (Math.random() * 9);/*"Math.random " se usa para generar numeros aleatorios en este caso del 0 al 9*/
			int num_ganador = (int) num_ganador_double;/*el num_ganador toma el valor de num_ganador_double*/

			if (num_bingo == num_ganador_double) {/*si el numero que elegiste es igual a num_ganador_double ganaste*/
				System.out.println("Ganaste!");
			} else {/*si no se cumplen las condiciones anteriores se van ejecuar las ordenes dentro del else*/
				System.out.println("Perdiste :(");
				System.out.println("El numero ganador es: " + num_ganador);/*"+ num_ganador" sirve para que aparesca al final del texto */
			}

			

		default:/*si no cumple ninguna de los case pasa para el default*/
			System.out.println("Opcion incorrecta.");
			break;/*indica el final del case 3*/

		}
	}
}
