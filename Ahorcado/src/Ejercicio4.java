import java.util.Scanner;

public class Ejercicio4 {

	/**
	 * Program para crear los trenes usando la clase Tren donde se encuentran los
	 * atributos, constructores, gettes y setters y los metodos especiales.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// se inicializa un scanner para tomar los datos que introduce el usuario
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el tipo de tren:");
		String typeTrain = sc.nextLine();
		System.out.println("Introduzca la referencia del tren:");
		int refTrain = sc.nextInt();
		System.out.println("Introduzca el numero de asientos ocupados:");
		int seatsTrain = sc.nextInt();
		System.out.println("Introduzca los años de servicio del tren");
		int ageTrain = sc.nextInt();

		// Se crea una clase Tren nueva y se visualizan los datos metidos por consola
		Tren t1 = new Tren(typeTrain, refTrain, seatsTrain, ageTrain);
		System.out.println(t1.mostrarDatos());
		t1.DemasiadoViejo(ageTrain);
		t1.TrenLleno(seatsTrain);

		sc.close();

	}

}
