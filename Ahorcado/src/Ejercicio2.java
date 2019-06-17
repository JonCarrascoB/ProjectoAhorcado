import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	/**
	 * Programa para indicar si un participante de un campeonato de automovilismo
	 * puede o no ganar
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca los puntos del participante");
		// excepcion por si se introduce un parametro que no sea un numero entero
		try {
			int puntos = sc.nextInt();
			// Excepcion para numeros negativos que son imposibles en el programa
			try {
				if (Ganar(puntos)) {
					System.out.println("Puedes ganar el campeonato");
				} else {
					System.out.println("Ponte las pilas si quieres ganar");
				}
			} catch (NullPointerException e) {
				System.out.println("El parametro esta fuera de rango");
			}
		} catch (InputMismatchException e) {
			System.out.println("El parametro no tiene el formato adecuado");
		}
		sc.close();

	}

	/**
	 * Metodo para decidir si se esta o no dentro del rango de 70 puntos
	 * 
	 * @param puntos
	 * @return true o false
	 */
	private static Boolean Ganar(int puntos) {
		// Correcion de Ander
		Boolean resul = false;

		if (puntos >= 70) {
			resul = true;
		} else if (puntos < 70 && puntos >= 0) {
			resul = false;
		}
		return resul;

	}

}
