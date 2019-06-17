import java.util.Scanner;

public class Ejercicio3 {

	/**
	 * Program para meter 10 numeros en un array y usar sus valores para hallar los
	 * multiplos de 7 y la media aritmetica con dos decimales.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Se crea el array, introduciendo los 10 valores
		int[] numeros = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un numero entero mayores de 0: ");
			int num = sc.nextInt();
			numeros[i] = num;
		}

		// se obtienen los multiplos de 7 entre los numeros
		System.out.println("Los numeros multiplos de 7 son: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 7 == 0) {
				System.out.println(numeros[i]);
			}
		}

		// se obtiene la media aritmetica de los valores del array
		float suma = 0;
		System.out.println("la media aritmetica de los numeros del array es: ");
		for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];
		}
		System.out.println((Math.round(suma / 10)*100)/100);
		sc.close();

	}

}
