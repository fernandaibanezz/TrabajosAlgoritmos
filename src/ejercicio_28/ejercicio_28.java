package ejercicio_28;

public class ejercicio_28 {

	public static void main(String[] args) throws InterruptedException {

		int bateria = 100;

		while (bateria > 0 && bateria <= 100) {

			bateria--;

			System.out.println(bateria + "%");
			Thread.sleep(20);

			if (bateria == 20) {
				Thread.sleep(1000);
				System.out.println("Bateria baja");
				
				

			}
			if (bateria==0) {
			System.out.println("bateria agotada");
		}
	}
}
}