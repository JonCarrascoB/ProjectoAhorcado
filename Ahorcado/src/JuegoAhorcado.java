import java.util.Scanner;

public class JuegoAhorcado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int vidas = 7;
		int aciertos = 0;
		int cont = 0;
		
		// Pruebas de desarrollo con una palabra fija
		// String palabra = "viernes";

		// creamos un arry de palabras que salgan al azar, para dar más dinamismo al
		// juego
		String[] palabras = new String[] { "emperador", "arcipreste", "almirante", "comodoro", "sacerdote",
				"camposanto", "pelmazo" };

		// Insertamos un random para que las palabras salgan al azar
		String palabra = palabras[(int) (Math.random() * (palabras.length - 1))];

		int tamano = palabra.length();

		char[] respuesta = new char[tamano];
		Boolean[] respRep = new Boolean[tamano];

		System.out.println("******** Jugemos al ahorcado ***********");

		for (int i = 0; i < tamano; i++) {
			respuesta[i] = '_';
		}

		for (int i = 0; i < tamano; i++) {
			respRep[i] = false;
		}

		// se crea un bucle que pide letras hasta que se acaben las vidas o se gane
		do {

			System.out.println("Inserte una letra: ");
			
			// Introducimos esta excepcion por si se pulsa intro sin meter ninguna letra
			try {
				String letra = sc.nextLine();

				// Ahora comprobamos que se ha metido un string de un caracter (letra) 
				// y no una cadena de valores
				if (letra.length() <= 1) {

					// Ahora obviamos que metan ningun otro tipo de caracter que no se una letra
					// y de esa forma que no corran vidas
					if (Character.isLetter(letra.charAt(0))) {

						// Ahora impedimos que al usar una mayuscula pierda una vida
						if (Character.isLowerCase(letra.charAt(0))) {

							// busca si contiene la letra introducida en la palabra
							if (palabra.contains(letra)) {
								for (int i = 0; i < tamano; i++) {
									if (palabra.charAt(i) == letra.charAt(0) && respRep[i].equals(false)) {
										respuesta[i] = letra.charAt(0);
										respRep[i] = true;
										cont++;
									}

								}

								aciertos = aciertos + cont; // acierta
							} else {
								vidas = vidas - 1; // pierde vida
							}
							cont = 0;
							dibujo(vidas); // Llama a un metodo con los dibujos pasando el numero de vidas
							System.out.println("Tus vidas son: " + vidas + "/7."); // controla que pierdes vida
							for (int i = 0; i < tamano; i++) {
								System.out.println("---- " + respuesta[i] + " ------ ");

							}
						} else {
							System.out.println("Debe introducir una letra minuscula, pruebe otra vez");
						}
					} else {
						System.out.println("Si no introduces una letra, no puedes jugar, prueba otra vez");
					}
				} else {
					System.out.println("Se debe introducir una letra, no una palabra, pruebe otra vez");
				}
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("Debe introducir algo");
			}

		} while (vidas != 0 && aciertos != tamano);

		if (vidas == 0) {
			dibujo(vidas);
		} else {
			System.out.println("-----------");
			for (int i = 0; i < tamano; i++) {
				System.out.println("---- " + respuesta[i] + " ------ ");
			}
			System.out.println("*******Tus has ganado******");
		}
		sc.close();

	}

	// metodo para que aparezca el dibujo
	private static void dibujo(int i) {
		switch (i) {
		case 0:
			System.out.println("------");
			System.out.println("|    |");
			System.out.println("|    O");
			System.out.println("|   -|-");
			System.out.println("|    /|");
			System.out.println("|     ");
			System.out.println("|     ");
			System.out.println("------");
			System.out.println("***** Has perdido *****");
			break;
		case 1:
			System.out.println("------");
			System.out.println("|    |");
			System.out.println("|    O");
			System.out.println("|   -|-");
			System.out.println("|    /");
			System.out.println("|     ");
			System.out.println("|     ");
			System.out.println("------");
			break;
		case 2:
			System.out.println("------");
			System.out.println("|    |");
			System.out.println("|    O");
			System.out.println("|   -|-");
			System.out.println("|      ");
			System.out.println("|     ");
			System.out.println("|     ");
			System.out.println("------");
			break;
		case 3:
			System.out.println("------");
			System.out.println("|    |");
			System.out.println("|    O");
			System.out.println("|   -| ");
			System.out.println("|      ");
			System.out.println("|     ");
			System.out.println("|     ");
			System.out.println("------");
			break;
		case 4:
			System.out.println("------");
			System.out.println("|    |");
			System.out.println("|    O");
			System.out.println("|    | ");
			System.out.println("|      ");
			System.out.println("|     ");
			System.out.println("|     ");
			System.out.println("------");
			break;
		case 5:
			System.out.println("------");
			System.out.println("|    |");
			System.out.println("|    O");
			System.out.println("|     ");
			System.out.println("|     ");
			System.out.println("|     ");
			System.out.println("|     ");
			System.out.println("------");
			break;
		case 6:
			System.out.println("------");
			System.out.println("|    |");
			System.out.println("|     ");
			System.out.println("|      ");
			System.out.println("|      ");
			System.out.println("|     ");
			System.out.println("|     ");
			System.out.println("------");
			break;
		case 7:
			System.out.println("------");
			System.out.println("|     ");
			System.out.println("|     ");
			System.out.println("|      ");
			System.out.println("|      ");
			System.out.println("|     ");
			System.out.println("|     ");
			System.out.println("------");
			break;
		}

	}
}
