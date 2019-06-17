import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	/**
	 * Ejercicio 1 clasifica la clase de los boxeadores segun el peso introducido
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Pedira pesos de boxeadores hasta que pasen los 30 y te indica la categoria
		for (int i = 0; i < 30; i++) {
			System.out.println("Introduce el peso del boxeador: ");
			try {
				int peso = Integer.parseInt(sc.nextLine());

				if (peso > 90) {
					System.out.println("Pesado");
				} else if (peso >= 65 && peso <= 90) {
					System.out.println("Mediano");
				} else if (peso >= 58 && peso <= 64) {
					System.out.println("Ligero");
				} else if (peso >= 52 && peso <= 57) {
					System.out.println("Pluma");
				} else if (peso < 52 && peso > 0) {
					System.out.println("Mosca");
				} else {
					System.out.println("Ha introducido datos sin el formato indicado o fuera de rango");
				}
			} catch (NumberFormatException e) {
				System.out.println("Ha introducido datos sin el formato indicado o fuera de rango");
			}
		}
		sc.close();
	}

}
