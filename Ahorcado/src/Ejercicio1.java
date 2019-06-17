import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	/**
	 * Ejercicio 1 clasifica la clase de los boxeadores segun el peso introducido
	 * 
	 * @param args
	 */

	// Correccion de Ander:

	final static int PESO_MOSCA = 52;
	final static int PESO_PLUMA = 57;
	final static int PESO_LIGERO = 65;
	final static int PESO_MEDIANO = 90;
	// >90

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		// Pedira pesos de boxeadores hasta que pasen los 30 y te indica la categoria
		try {

			for (int i = 0; i < 30; i++) {
				System.out.println("Introduce el peso del boxeador: ");
				int peso = Integer.parseInt(sc.nextLine());

				// correcion de Ander

				if (peso <= 0) {
					throw new Exception("Peso incorrecto, debe ser mayor que 0");
				}

				if (peso < PESO_MEDIANO) {
					System.out.println("Mediano");
				} else if (peso < PESO_LIGERO) {
					System.out.println("Ligero");
				} else if (peso < PESO_PLUMA) {
					System.out.println("Pluma");
				} else if (peso < PESO_MOSCA) {
					System.out.println("Mosca");
				} else {
					System.out.println("Pesado");
				}

			} // for end

		} catch (NumberFormatException e) {
			System.out.println("Ha introducido datos sin el formato indicado o fuera de rango");
		}
		sc.close();
	}

}
