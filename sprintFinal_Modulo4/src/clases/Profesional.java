package clases;

public class Profesional extends Usuario {
	private String titulo;
	private String fechaIngreso;
	
	/**
	 * Constructor Vacio.
	 */
	public Profesional() {

	}
	
	/**
	 * @param nombre Nombre del Usuario.
	 * @param apellido Apellido del Usuario.
	 * @param fechaDeNacimiento Fecha de Nacimiento del Usuario.
	 * @param run Rut del Usuario.
	 * @param titulo Titulo de estudios del Profesional.
	 * @param fechaIngreso Fecha de ingreso a la empresa del Profesional.
	 */
	public Profesional(String nombre, String apellido, String fechaDeNacimiento, String run, String titulo, String fechaIngreso) {
		super(nombre, apellido, fechaDeNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	/** 
	 * 
	 * Método para mostrar la información de los atributos de la clase.
	 * 
	 * */
	@Override
	public void analizarUsuario() {		
		System.out.println("Información Usuario-Profesional");
		super.analizarUsuario();
		System.out.println("Titulo: " + titulo);
		System.out.println("Fecha de Ingreso: " + fechaIngreso);
		System.out.println("");
	}
	
	
}
