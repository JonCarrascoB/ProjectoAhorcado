
public class Tren {

	public final static int CAPACIDAD_MAXIMA = 400;

	// Atributos
	private String tipo;
	private int referencia;
	private int asientosOcupados;
	private int a�osActivo;

	// constructores

	public Tren() {
		super();
		this.tipo = "Sin calificar";
		this.referencia = 0;
		this.asientosOcupados = 0;
		this.a�osActivo = 0;
	}

	public Tren(String tipo, int referencia, int asientosOcupados, int a�osActivo) {
		this();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.a�osActivo = a�osActivo;
	}

	// getters y setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}

	public int getA�osActivo() {
		return a�osActivo;
	}

	public void setA�osActivo(int a�osActivo) {
		this.a�osActivo = a�osActivo;
	}

// metodos

	@Override
	public String toString() {
		return "El tren de tipo " + tipo + ", con la referencia igual a " + referencia + ", con un total de asientos ocupados de " + asientosOcupados
				+ ", y a�os en servicio de " + a�osActivo;
	}

	public static void TrenLleno(int asientos) {
		if (asientos <= CAPACIDAD_MAXIMA) {
			System.out.println("El tren no esta lleno");
		} else {
			System.out.println("Se han vendido m�s billetes de los posibles");
		}
	}

	public static void DemasiadoViejo(int a�os) {
		if (a�os >= 40) {
			System.out.println("FUERA DE CIRCULACION");
		} else {
			System.out.println("EN CIRCULACION");
		}
	}

}
