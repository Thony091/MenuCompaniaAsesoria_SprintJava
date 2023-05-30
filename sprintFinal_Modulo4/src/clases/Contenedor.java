package clases;

import java.util.ArrayList;

import interfaces.IAsesoria;

public class Contenedor {

	private ArrayList<IAsesoria> usuarios;
	private ArrayList<Capacitacion> capacitaciones;

	/**
	 * Constructor Vacio.
	 */
	public Contenedor() {

	}

	/**
	 * @param usuarios Lista que almacena instacias de la clase usuarios y sus extenciones. 
	 * @param capacitaciones Lista que almacena instacias de la clase capacitacion.
	 */
	public Contenedor(ArrayList<IAsesoria> usuarios, ArrayList<Capacitacion> capacitaciones) {
		
		this.usuarios = usuarios;
		this.capacitaciones = capacitaciones;
	}

	public ArrayList<IAsesoria> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<IAsesoria> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Capacitacion> getCapacitaciones() {
		return capacitaciones;
	}

	public void setCapacitaciones(ArrayList<Capacitacion> capacitaciones) {
		this.capacitaciones = capacitaciones;
	}

	// Métodos de la Clase.
	
	
	/**
	 * Método que almacena un nuevo usuario de tipo "Cliente" a la lista de usuariaos.
	 *  */	
	public ArrayList<IAsesoria> almacenarCliente(Cliente nuevoCliente) {
		usuarios.add(nuevoCliente);
		return usuarios;
	}
	
	/** 
	 * Método que almacena un nuevo usuario de tipo "Profesional" a la lista de usuariaos.
	 *  */	
	public ArrayList<IAsesoria> almacenarProfesional(Profesional nuevoProfesional) {
		usuarios.add(nuevoProfesional);
		return usuarios;
	}
	
	/**
	 * Método que almacena un nuevo usuario de tipo "Administrativo" a la lista de usuariaos.
	 *  */	
	public ArrayList<IAsesoria> almacenarAdministrativo(Administrativo nuevoAdministrativo) {
		usuarios.add(nuevoAdministrativo);
		return usuarios;
	}

	/**
	 * Método que elimina un usuario por el rut ingresado a la lista de usuariaos.
	 *  */	
	public ArrayList<IAsesoria> eliminarUsuario(String rutUsuarioAEliminar) {
		for (int i = 0; i < usuarios.size(); i++) {
			if (((Usuario) usuarios.get(i)).getRun().equals(rutUsuarioAEliminar)) {
				usuarios.remove(i);
				System.out.println("Usuario Eliminado correctamente");
			}			
		}
		System.out.println("Rut no encontrado en la base de datos");
		return usuarios;
	}

	
	/** 
	 * Método que Imprime la información de todos los usuarios registrados.
	 * */
	public void listarUsuarios() {
		for (IAsesoria listar : usuarios) {
			listar.analizarUsuario();
		}
	}

	/** 
	 * Método que Imprime la información por tipo de usuario de todos los usuarios registrados.
	 * */
	public void listarUsuariosPorTipo(String tipoUsuario) {
		System.out.println("\nImprimiendo datos de los Usuarios-" + tipoUsuario +"\n");
	
		switch (tipoUsuario.toLowerCase()) {
		case  "administrativo": {			
			for (IAsesoria info : usuarios) {
				if(info instanceof Administrativo) {
					Administrativo admin = (Administrativo) info;
					admin.analizarUsuario();
				}
			}
			break;
		}		
		case "cliente": {
			for (IAsesoria info : usuarios) {
				if(info instanceof Cliente) {
					Cliente admin = (Cliente) info;
					admin.analizarUsuario();
				}
			}
			break;
		}		
		case "profesional":{
			for (IAsesoria info : usuarios) {
				if(info instanceof Profesional) {
					Profesional admin = (Profesional) info;
					admin.analizarUsuario();
				}
			}
			break;
		}		
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipoUsuario);
		}

	}
	
	/** 
	 * Método que Imprime la información de todas las capacitaciones registradas.
	 * */
	public void listarCapacitaciones() {
		for (Capacitacion infoCapac : capacitaciones) {
			System.out.println("Listado de las capacitaciones\n");
			System.out.println("El número de identificador de la capacitación es: " + infoCapac.getIdentificador());
			System.out.println("Día: " + infoCapac.getDia());
			System.out.println("Hora: " + infoCapac.getHora());
			System.out.println("Lugar: " + infoCapac.getLugar());
			System.out.println("Duración: " + infoCapac.getDuracion());
			System.out.println("Cantidad de asistentes: " + infoCapac.getCantidadDeAsistentes());
			System.out.println("Rut de Cliente: " + infoCapac.getRutCliente());
			System.out.println("");

		}
	}

}
