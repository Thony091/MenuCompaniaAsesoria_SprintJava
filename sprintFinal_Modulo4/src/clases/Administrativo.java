package clases;

public class Administrativo extends Usuario{
	private String area;
	private String experienciaPrevia;
	
	/**
	 * Constructor Vacio.
	 */
	public Administrativo() {
	
	}
	
	/**
	 * @param nombre Nombre del Usuario.
	 * @param apellido Apellido del Usuario.
	 * @param fechaDeNacimiento Fecha de Nacimiento del Usuario.
	 * @param run Rut del Usuario.
	 * @param area Área de trabajo a la cual pertenece el Administrativo.
	 * @param experienciaPrevia Experiencia en otros trabajos del Administrativo.
	 * 
	 */
	public Administrativo(String nombre, String apellido, String fechaDeNacimiento, String run, String area, String experienciaPrevia) {
		super(nombre, apellido, fechaDeNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	
	/** 
	 * 
	 * Método para mostrar la información de los atributos de la clase.
	 * 
	 * */
	@Override
	public void analizarUsuario() {
		System.out.println("Información Usuario-Administrativo");
		super.analizarUsuario();		
		System.out.println("Área: " + area);
		System.out.println("Experiencia Previa: " + experienciaPrevia);
		System.out.println("");
	}
		
}
