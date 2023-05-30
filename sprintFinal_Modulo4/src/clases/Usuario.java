package clases;

import interfaces.IAsesoria;

public class Usuario implements IAsesoria{

	private String nombre;
	private String apellido;
	private String fechaDeNacimiento;
	private String run;
	
	/**
	 * Constructor Vacio.
	 */
	public Usuario() {
		
	}	
	
	/**
	 * @param nombre Nombre del Usuario.
	 * @param apellido Apellido del Usuario.
	 * @param fechaDeNacimiento Fecha de Nacimiento del Usuario.
	 * @param run Rut del Usuario.
	 */
	public Usuario(String nombre, String apellido, String fechaDeNacimiento, String run) {
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.run = run;
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", fechaDeNacimiento=" + fechaDeNacimiento
				+ ", run=" + run + "]";
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	/** 
	 * 
	 * Método para mostrar la información de los atributos de la clase.
	 * 
	 * */
	@Override
	public void analizarUsuario() {
		System.out.println("Nombre de usuario: " + nombre + " " + apellido);
		System.out.println("Rut de usuario: " + run);
		
	}

}
