package clases;

import java.time.LocalTime;

public class Accidente {
	
	private int idAccidente;
	private String rutCliente;
	private String fechaAccidente;
	private LocalTime hora;
	private String lugar;
	private String origen;
	private String consecuencias;
	
	/**
	 * Constructor Vacio.
	 */
	public Accidente() {
	}
	
	/**
	 * @param idAccidente Número Identificador del accidente.
	 * @param rutCliente Rut del cliente Asociado a la visita.
	 * @param fechaAccidente Fecha del accidente.
	 * @param hora Hora del accidente.
	 * @param lugar Lugar del accidente.
	 * @param origen Origen del accidente.
	 * @param consecuencias Consecuencias del accidente.
	 */
	public Accidente(int idAccidente, String rutCliente, String fechaAccidente, LocalTime hora, String lugar,
			String origen, String consecuencias) {
		super();
		this.idAccidente = idAccidente;
		this.rutCliente = rutCliente;
		this.fechaAccidente = fechaAccidente;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}

	public int getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getFechaAccidente() {
		return fechaAccidente;
	}

	public void setFechaAccidente(String fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	@Override
	public String toString() {
		return "Accidente [idAccidente=" + idAccidente + ", rutCliente=" + rutCliente + ", fechaAccidente="
				+ fechaAccidente + ", hora=" + hora + ", lugar=" + lugar + ", origen=" + origen + ", consecuencias="
				+ consecuencias + "]";
	}	
}
