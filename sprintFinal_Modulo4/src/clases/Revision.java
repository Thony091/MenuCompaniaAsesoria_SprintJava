package clases;

public class Revision {
	
	private int idRevision;
	private VisitaEnTerreno idVisita;
	private String nombreRevision;
	private String detalle;
	private String estado;
	
	/**
	 * Constructor Vacio.
	 */
	public Revision() {
	}
	
	/**
	 * @param idRevision Número identificador de de la revisión.
	 * @param idVisita Número identificador de la visita a terreno relacionada a la revision.
	 * @param nombreRevision Nombre alusivo a la revision.
	 * @param detalle Detalles para revisar.
	 * @param estado Estado en el que se encuentra la revision (sin problemas, con observaciones o no aprueba)
	 */
	public Revision(int idRevision, VisitaEnTerreno idVisita, String nombreRevision, String detalle, String estado) {
		this.idRevision = idRevision;
		this.idVisita = idVisita;
		this.nombreRevision = nombreRevision;
		this.detalle = detalle;
		this.estado = estado;
	}
	public int getIdRevision() {
		return idRevision;
	}
	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}
	public VisitaEnTerreno getIdVisita() {
		return idVisita;
	}
	public void setIdVisita(VisitaEnTerreno idVisita) {
		this.idVisita = idVisita;
	}
	public String getNombreRevision() {
		return nombreRevision;
	}
	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisita=" + idVisita + ", nombreRevision=" + nombreRevision
				+ ", detalle=" + detalle + ", estado=" + estado + "]";
	}	
	
}
