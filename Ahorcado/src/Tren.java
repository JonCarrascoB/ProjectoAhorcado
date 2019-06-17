
public class Tren {

	public final static int CAPACIDAD_MAXIMA = 400;

	// Atributos
	private String tipo;
	private int referencia;
	private int asientosOcupados;
	private int añosActivo;

	// constructores

	public Tren() {
		super();
		this.tipo = "Sin calificar";
		this.referencia = 0;
		this.asientosOcupados = 0;
		this.añosActivo = 0;
	}

	public Tren(String tipo, int referencia, int asientosOcupados, int añosActivo) {
		this();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.añosActivo = añosActivo;
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

	public int getAñosActivo() {
		return añosActivo;
	}

	public void setAñosActivo(int añosActivo) {
		this.añosActivo = añosActivo;
	}

// metodos

	@Override
	public String toString() {
		return "El tren de tipo " + tipo + ", con la referencia igual a " + referencia + ", con un total de asientos ocupados de " + asientosOcupados
				+ ", y años en servicio de " + añosActivo;
	}

	public static void TrenLleno(int asientos) {
		if (asientos <= CAPACIDAD_MAXIMA) {
			System.out.println("El tren no esta lleno");
		} else {
			System.out.println("Se han vendido más billetes de los posibles");
		}
	}

	public static void DemasiadoViejo(int años) {
		if (años >= 40) {
			System.out.println("FUERA DE CIRCULACION");
		} else {
			System.out.println("EN CIRCULACION");
		}
	}

}
