import java.util.Scanner;

public class Ejercicio3 {

	/**
	 * Program para meter 10 numeros en un array y usar sus valores para hallar los
	 * multiplos de 7 y la media aritmetica con dos decimales.
	 * 
	 * @param args
	 */

	//Correcion de Ander
			final static int MAX_NUMEROS = 10;
			static int [] aNumeros = new int[MAX_NUMEROS];
			
	public static void main(String[] args) {

		// Se crea el array, introduciendo los 10 valores
		//int[] numeros = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < MAX_NUMEROS; i++) {
			System.out.println("Introduce un numero entero mayores de 0: ");
			int num = Integer.parseInt(sc.nextLine());
			aNumeros[i] = num;
		}

		// se obtienen los multiplos de 7 entre los numeros
		System.out.println("Los numeros multiplos de 7 son: ");
		for (int i = 0; i < aNumeros.length; i++) {
			if (aNumeros[i] % 7 == 0) {
				System.out.println(aNumeros[i]);
			}
		}

		// se obtiene la media aritmetica de los valores del array
		float suma = 0;
		System.out.println("la media aritmetica de los numeros del array es: ");
		for (int i = 0; i < aNumeros.length; i++) {
			suma = suma + aNumeros[i];
		}
		float media = suma / MAX_NUMEROS;
		System.out.printf("Media %.2f" + media);
		sc.close();

	}

}
