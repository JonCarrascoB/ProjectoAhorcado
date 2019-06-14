import java.util.Scanner;

public class JuegoAhorcado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int vidas = 7;
		int aciertos = 0;
		int cont = 0;

		String palabra = "viernes";
		char[] pal = palabra.toCharArray();
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
			String letra = sc.nextLine();
			

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
				dibujo(vidas); // Llama a un metodo con los dibujos pasando el numero de vidas
				System.out.println("Tus vidas son: " + vidas + "/7."); // controla que pierdes vida
			}
			cont = 0;

			for (int i = 0; i < tamano; i++) {
				System.out.println("---- " + respuesta[i] + " ------ ");
				
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
