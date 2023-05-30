package clases;

public class Capacitacion extends Usuario{
	
	private int identificador;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantidadDeAsistentes;
	
	/** 
	 * Constructor Vacio.
	 * */
	public Capacitacion() {
		
	}
	
	/**
	 * @param identificador Número de identificador de la capacitación.
	 * @param rutCliente Rut del clinte de la capacitación.
	 * @param dia Día de la capacitación.
	 * @param hora Hora de la capacitación.
	 * @param lugar Lugar de la capacitación.
	 * @param duracion Duración de la capacitación.
	 * @param cantidadDeAsistentes Cantidad de asistentes de la capacitación.
	 */
	public Capacitacion(int identificador, int rutCliente, String dia, String hora, String lugar, String duracion,
			int cantidadDeAsistentes) {

		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadDeAsistentes = cantidadDeAsistentes;
	}

	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadDeAsistentes="
				+ cantidadDeAsistentes + "]";
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getCantidadDeAsistentes() {
		return cantidadDeAsistentes;
	}

	public void setCantidadDeAsistentes(int cantidadDeAsistentes) {
		this.cantidadDeAsistentes = cantidadDeAsistentes;
	}
	
	/** 
	 * 
	 * Método para mostrar la información de los atributos 
	 * (lugar, hora y duracion) de la clase.
	 * 
	 * */
	public void mostrarDetalle() {
		System.out.println("La capacitación será en " + this.lugar + " a las " + this.hora + ", y durará " + (Integer. valueOf(duracion)*60) + " minutos.");
	}
}
