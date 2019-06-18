
public class Tren {

	public final static int CAPACIDAD_MAXIMA = 400;
	public final static int EDAD_MAXIMA = 40;

	// Atributos
	private String tipo;
	private int referencia;
	private int asientosOcupados;
	private int anosActivo;

	// constructores

	public Tren() {
		super();
		this.tipo = "Sin calificar";
		this.referencia = 0;
		this.asientosOcupados = 0;
		this.anosActivo = 0;
	}

	public Tren(String tipo, int referencia, int asientosOcupados, int añosActivo) {
		this();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.anosActivo = añosActivo;
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

	public int getAnosActivo() {
		return anosActivo;
	}

	public void setAnosActivo(int añosActivo) {
		this.anosActivo = añosActivo;
	}

// metodos

	public String mostrarDatos() {
		return "El tren de tipo " + tipo + ", con la referencia igual a " + referencia
				+ ", con un total de asientos ocupados de " + asientosOcupados + ", y años en servicio de "
				+ anosActivo;
	}

	/**
	 * Programa para ver si esta lleno o no
	 * 
	 * @see CAPACIDAD_MAXIMA
	 * @param asientos
	 */
	public boolean TrenLleno() {
		boolean resul = false;
		if (this.asientosOcupados <= CAPACIDAD_MAXIMA) {
			resul = true;
		} 
		return resul;
	}

	/**
	 * Program para ver si el tren esta en activo
	 * @see EDAD_MAXIMA
	 * @param años
	 */
	public boolean DemasiadoViejo() {
		boolean resul = false;
		if (this.anosActivo >= EDAD_MAXIMA) {
			resul = true;
		} 
		return resul;
		
	}

}
