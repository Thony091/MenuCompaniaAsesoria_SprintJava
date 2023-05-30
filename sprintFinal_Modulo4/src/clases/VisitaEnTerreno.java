package clases;

public class VisitaEnTerreno {
	
	private int idVisita;
	private Cliente rutCliente;
	private String fechaAccidente;
	private String hora;
	private String lugar;
	private String comentario;
	
	/**
	 * Constructor Vacio.
	 */
	public VisitaEnTerreno() {
		
	}

	/**
	 * @param idVisita Número identificador de la visita a terreno relacionada a la revision.
	 * @param rutCliente Rut del cliente Asociado a la visita.
	 * @param fechaAccidente Fecha de accidente asocviada a la visita.
	 * @param hora Hora de la visita a terreno.
	 * @param lugar Lugar de la visita a terreno.
	 * @param comentario Comentario de la visita a terreno.
	 */
	public VisitaEnTerreno(int idVisita, Cliente rutCliente, String fechaAccidente, String hora, String lugar,
			String comentario) {
		super();
		this.idVisita = idVisita;
		this.rutCliente = rutCliente;
		this.fechaAccidente = fechaAccidente;
		this.hora = hora;
		this.lugar = lugar;
		this.comentario = comentario;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public Cliente getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(Cliente rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getFechaAccidente() {
		return fechaAccidente;
	}

	public void setFechaAccidente(String fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
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

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "VisitaEnTerreno [idVisita=" + idVisita + ", rutCliente=" + rutCliente + ", fechaAccidente="
				+ fechaAccidente + ", hora=" + hora + ", lugar=" + lugar + ", comentario=" + comentario + "]";
	}		
}
