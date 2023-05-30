package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import clases.Administrativo;
import clases.Capacitacion;
import clases.Cliente;
import clases.Contenedor;
import clases.Profesional;
import interfaces.IAsesoria;

public class Main {
	 
/**
 * Sprint Final - Modulo 4 
 * Integrantes:
 * -Cesar Albornoz
 * -Catalina Muñoz
 * -Jaime Godoy
 * -Anthony Flores
 * 
 *  */
	
	public static void main(String[] args) {
		//Creación de usuarios para llenar lista y probar si no se quisiera ingresar  nuevos usuarios por el menu.
		Cliente cliente1 = new Cliente("Julian", "Acevedo", "19/05/2000", "12345678", 98778761, "Modelo", "Isapre", "Calle falsa 1", "San bernardo", 44);
		Cliente cliente2 = new Cliente("Ramon", "Valdes", "05/11/1900", "11111111", 912238123, "Plan Vital", "Fonasa", "Calle falsa 34", "La molina", 30);
		Profesional profesional1 = new Profesional("Armando", "Paredes", "06/06/2006", "12121212", "ingenieria Civil", "20/12/2022");
		Administrativo admin1 = new Administrativo("Juana", "Alarcon", "17/02/1422", "13131313", "Recursos humanos", "3 años en baño");
		
		//Creacion de listas que seran atributos de la instancia Contenedor (Solicitado en el pdf del Sprint)
		ArrayList<IAsesoria> usuarios = new ArrayList<>();
		ArrayList<Capacitacion> capacitaciones = new ArrayList<>();
		Contenedor contenedor = new Contenedor(usuarios,capacitaciones);
		Scanner sc = new Scanner(System.in);
		
		//Ingresando usuarios a la lista con el el metodo correspondiente a cada tipo de usuario.
		contenedor.almacenarCliente(cliente1);
		contenedor.almacenarCliente(cliente2);
		contenedor.almacenarProfesional(profesional1);
		contenedor.almacenarAdministrativo(admin1);
		int eleccionMenu;
		
		do {		
			System.out.println("");
			System.out.println("******************************************************");
			System.out.println("*    Bienvenido a su Plataforma de Gestión Humana    *");
			System.out.println("******************************************************");
			System.out.println("*                                                    *");
			System.out.println("*                 * MENU PRINCIPAL *                 *");
			System.out.println("*            1. Almacenar Cliente                    *");
			System.out.println("*            2. Almacenar Profesional                *");
			System.out.println("*            3. Almacenar Administrativo             *");
			System.out.println("*            4. Almacenar Capacitación               *");
			System.out.println("*            5. Eliminar Usuario                     *");
			System.out.println("*            6. Listar Usuarios                      *");
			System.out.println("*            7. Listar Usuarios por Tipo             *");
			System.out.println("*            8. Listar capacitaciones                *");
			System.out.println("*            9. Salir                                *");
			System.out.println("*                                                    *");
			System.out.println("******************************************************");
			eleccionMenu = sc.nextInt();
			 
			sc.nextLine();
			
			switch (eleccionMenu) {
			case 1: {				
				System.out.println("Ingresar los siguientes datos\n");
				
				System.out.println("Ingrese el/los nombre(s): "
						+ "\nEste campo debe contener un minimo de 5 y un maximo de 30 letras.");
				String nombre = sc.nextLine();
				while(nombre.length() < 5 || nombre.length() > 30) {
					System.out.println("Este campo debe contener un minimo de 5 y un maximo de 30 letras."
							+ "\nIntentelo nuevamente");
					nombre = sc.nextLine();
				}		
				
				System.out.println("\nIngrese el/los apellido(s): "
						+ "\nEste campo debe contener un minimo de 5 y un maximo de 30 letras.");
				String apellido = sc.nextLine();
				while(apellido.length() < 5 || apellido.length() > 30) {
					System.out.println("Este campo debe contener un minimo de 5 y un maximo de 30 letras. "
							+ "\nIntentelo nuevamente");
					apellido = sc.nextLine();
				}	
				
				System.out.println("\nIngrese la fecha de nacimiento: "
						+ "\nEl formato de la fecha debe ser dd/mm/aaaa");
				String fechaNacimiento = sc.nextLine();
				String regexp = "\\d{1,2}/\\d{1,2}/\\d{4}";					
				while(Pattern.matches(regexp, fechaNacimiento) == false ) {
					System.out.println("El formato de la fecha debe ser dd/mm/aaaa "
							+ "\nIntentelo nuevamente");
					fechaNacimiento = sc.nextLine();
				}		
				
				System.out.println("\nIngrese el rut(sin puntos ni número verificador): "
						+ "\nEl número no puede ser más 99'999'999");
				int run = sc.nextInt();
				while(run > 99999999) {
					System.out.println("El número no puede ser más 99'999'999"
							+ "\nIntentelo nuevamente");
					run = sc.nextInt();
				}
				sc.nextLine();
				
				
				System.out.println("\nIngrese el teléfono: "
						+ "\nAlmenos 6 números");
				int telefono = sc.nextInt();
				while(telefono < 6 ) {
					System.out.println("Ingrese un número valido"
							+ "\nIntentelo nuevamente");
					telefono = sc.nextInt();
				}
				sc.nextLine();				
				
				System.out.println("\nIngrese su AFP:");
				String afp = sc.nextLine();
				while(afp.length() < 4 || afp.length() > 30) {
					System.out.println("La afp debe contener almenos 4 letras de nombre. "
							+ "\nIntentelo nuevamente.");
					afp = sc.nextLine();
				}
				
				System.out.println("\nIngrese su sistema de salud:"
						+ "\nFonasa"
						+ "\nIsapre");
				String sistemaSalud = sc.nextLine();				
				while(!sistemaSalud.equalsIgnoreCase("Fonasa") && !sistemaSalud.equalsIgnoreCase("Isapre")) {
					System.out.println("Debe ingresar 'Fonasa' o 'Isapre'");
					sistemaSalud = sc.nextLine();					
				}
				
				System.out.println("\nIngrese la dirección:");
				String direccion = sc.nextLine();
				while(direccion.length() > 70 ) {
					System.out.println("Solo puede ingresar un maximo de 70 caracteres. "
							+ "\nIntentelo nuevamente.");
					direccion = sc.nextLine();
				}
				
				System.out.println("\nIngrese la comuna:");
				String comuna = sc.nextLine();
				while(comuna.length() > 50 ) {
					System.out.println("Solo puede ingresar un maximo de 50 caracteres. "
							+ "\nIntentelo nuevamente.");
					comuna = sc.nextLine();
				}
				
				System.out.println("\nIngrese la edad:");
				int edad = sc.nextInt();
				while(edad < 0 || edad > 150) {
					System.out.println("La edad debe ser mayor a 0 y menor a 150."
							+ "\nIntentelo nuevamente.");
					edad = sc.nextInt();					
				}
				sc.nextLine();
				
				Cliente nuevoCliente = new Cliente(nombre, apellido, fechaNacimiento, String.valueOf(run), telefono, afp, sistemaSalud, direccion, comuna, edad);
				contenedor.almacenarCliente(nuevoCliente);
				System.out.println("\nIngreso de Usuario Exitoso");
				System.out.println("\nEnter para volver al menu principal");
				sc.nextLine();
				break;
			}
			
			case 2:{
				System.out.println("Ingresar los siguientes datos\n");
				
				System.out.println("Ingrese el/los nombre(s): "
						+ "\nEste campo debe contener un minimo de 5 y un maximo de 30 letras.");
				String nombre = sc.nextLine();
				while(nombre.length() < 5 || nombre.length() > 30) {
					System.out.println("Este campo debe contener un minimo de 5 y un maximo de 30 letras."
							+ "\nIntentelo nuevamente");
					nombre = sc.nextLine();
				}		
				
				System.out.println("Ingrese el/los apellido(s): "
						+ "\nEste campo debe contener un minimo de 5 y un maximo de 30 letras.");
				String apellido = sc.nextLine();
				while(apellido.length() < 5 || apellido.length() > 30) {
					System.out.println("Este campo debe contener un minimo de 5 y un maximo de 30 letras. "
							+ "\nIntentelo nuevamente");
					apellido = sc.nextLine();
				}	
				
				System.out.println("Ingrese la fecha de nacimiento: "
						+ "\nEl formato de la fecha debe ser dd/mm/aaaa");
				String fechaNacimiento = sc.nextLine();
				String regexp = "\\d{1,2}/\\d{1,2}/\\d{4}";					
				while(Pattern.matches(regexp, fechaNacimiento) == false ) {
					System.out.println("El formato de la fecha debe ser dd/mm/aaaa "
							+ "\nIntentelo nuevamente");
					fechaNacimiento = sc.nextLine();
				}		
				
				System.out.println("Ingrese el rut(sin puntos ni número verificador): "
						+ "\nEl número no puede ser más 99'999'999");
				int run = sc.nextInt();
				while(run > 99999999) {
					System.out.println("El número no puede ser más 99'999'999"
							+ "\nIntentelo nuevamente");
					run = sc.nextInt();
				}
				sc.nextLine();
				
				System.out.println("Ingrese el título: ");
				String titulo = sc.nextLine();
				while(titulo.length() < 10 || titulo.length() > 50) {
					System.out.println("El título debe contener más de 10 caracteres y menos de 50,"
							+ "\nintentelo nuevamente.");
					titulo = sc.nextLine();					
				}
				
				System.out.println("Ingrese la fecha de ingreso: "
						+ "\nEl formato de la fecha debe ser dd/mm/aaaa");
				String fechaIngreso = sc.nextLine();
				regexp = "\\d{1,2}/\\d{1,2}/\\d{4}";					
				while(Pattern.matches(regexp, fechaIngreso) == false ) {
					System.out.println("El formato de la fecha debe ser dd/mm/aaaa "
							+ "\nIntentelo nuevamente");
					fechaIngreso = sc.nextLine();
				}	
				
				Profesional nuevoProfesional = new Profesional(nombre, apellido, fechaNacimiento, String.valueOf(run), titulo, fechaIngreso);
				contenedor.almacenarProfesional(nuevoProfesional);
				System.out.println("\nIngreso de Usuario Exitoso");
				System.out.println("\nEnter para volver al menu principal");
				sc.nextLine();
				break;
			}
			case 3:{
				System.out.println("Ingresar los siguientes datos\n");
				
				System.out.println("Ingrese el/los nombre(s): "
						+ "\nEste campo debe contener un minimo de 5 y un maximo de 30 letras.");
				String nombre = sc.nextLine();
				while(nombre.length() < 5 || nombre.length() > 30) {
					System.out.println("Este campo debe contener un minimo de 5 y un maximo de 30 letras."
							+ "Intentelo nuevamente");
					nombre = sc.nextLine();
				}		
				
				System.out.println("Ingrese el/los apellido(s): "
						+ "\nEste campo debe contener un minimo de 5 y un maximo de 30 letras.");
				String apellido = sc.nextLine();
				while(apellido.length() < 5 || apellido.length() > 30) {
					System.out.println("Este campo debe contener un minimo de 5 y un maximo de 30 letras. "
							+ "\nIntentelo nuevamente");
					apellido = sc.nextLine();
				}	
				
				System.out.println("Ingrese la fecha de nacimiento: "
						+ "\nEl formato de la fecha debe ser dd/mm/aaaa");
				String fechaNacimiento = sc.nextLine();
				String regexp = "\\d{1,2}/\\d{1,2}/\\d{4}";					
				while(Pattern.matches(regexp, fechaNacimiento) == false ) {
					System.out.println("El formato de la fecha debe ser dd/mm/aaaa "
							+ "\nIntentelo nuevamente");
					fechaNacimiento = sc.nextLine();
				}		
				
				System.out.println("Ingrese el rut(sin puntos ni número verificador): "
						+ "\nEl número no puede ser más 99'999'999");
				int run = sc.nextInt();
				while(run > 99999999) {
					System.out.println("El número no puede ser más 99'999'999"
							+ "\nIntentelo nuevamente");
					run = sc.nextInt();
				}
				sc.nextLine();
				
				System.out.println("Ingrese el Área: ");
				String area = sc.nextLine();
				while(area.length() < 5 || area.length() > 20) {
					System.out.println("El área debe contener un minimo de 5 caracteres y un maximo de 20."
							+ "\nIntentelo nuevamente.");
					area = sc.nextLine();					
				}
				
				System.out.println("Ingrese la experiencia previa: ");
				String experienciaPrevia = sc.nextLine();
				while(experienciaPrevia.length() > 100 ) {
					System.out.println("Este campo no debe contener mas de 100 caracteres."
							+ "\nIntentelo nuevamente.");
					experienciaPrevia = sc.nextLine();					
				}
				
				Administrativo nuevoAdministrativo = new Administrativo(nombre, apellido, fechaNacimiento, String.valueOf(run), area, experienciaPrevia);
				contenedor.almacenarAdministrativo(nuevoAdministrativo);
				System.out.println("\nIngreso de Usuario Exitoso");
				System.out.println("\nEnter para volver al menu principal");
				sc.nextLine();
				break;
			}
			
			case 4:{
				System.out.println("Ingrese datos de la capacitación\n");
				System.out.println("Ingrese el número de identificador de capacitación");
				int identificadorCapacitacion = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Ingrese el rut(sin puntos ni número verificador): "
						+ "\nEl número no puede ser más 99'999'999");
				int runCliente = sc.nextInt();
				while(runCliente > 99999999) {
					System.out.println("El número no puede ser más 99'999'999"
							+ "\nIntentelo nuevamente");
					runCliente = sc.nextInt();
				}
				sc.nextLine();
				
				
				System.out.println("Ingrese el dia de semana:"
						+ "\nLunes"
						+ " ó Martes"
						+ " ó Miercoles"
						+ " ó Jueves"
						+ " ó Viernes"
						+ " ó Sabado"
						+ " ó Domingo");
				String dia = sc.nextLine();

				while(!dia.equalsIgnoreCase("Lunes") && !dia.equalsIgnoreCase("Martes") && 
					!dia.equalsIgnoreCase("Miercoles") && !dia.equalsIgnoreCase("Jueves") && 
					!dia.equalsIgnoreCase("Viernes") && !dia.equalsIgnoreCase("Sabado") && 
					!dia.equalsIgnoreCase("Domingo")) {
					System.out.println("Debe ingresar Lunes"							
							+ " ó Martes"
							+ " ó Miercoles"
							+ " ó Jueves"
							+ " ó Viernes"
							+ " ó Sabado"
							+ " ó Domingo");
					dia = sc.nextLine();
				}
				
				String regExHora = "^([01]?[0-9]|2[0-3]):[0-5][0-9]$";
				System.out.println("Ingrese la hora(HH:MM): ");
				String hora = sc.nextLine();
				while(Pattern.matches(regExHora, hora) == false) {
					System.out.println("Debe ingresar un formato valido(HH:MM)"
							+ " hora de 0 a 23, minutos entre 0 y 59");
					hora = sc.nextLine();							
				}
				
				System.out.println("Ingrese el Lugar");
				String lugar = sc.nextLine();
				while(lugar.length() < 10 || lugar.length() > 50) {
					System.out.println("Debe contener almenos 10 caracteres y un maximo de 50"
							+ "\nIntentelo nuevamente.");
					lugar = sc.nextLine();					
				}
				
				System.out.println("Ingrese la duración");
				String duracion = sc.nextLine();
				while(duracion.length() > 70) {
					System.out.println("Debe contener un maximo de 70 caracteres"
							+ "\nIntentelo nuevamente.");
					lugar = sc.nextLine();					
				}
				
				System.out.println("Ingrese la cantidad de asistentes: ");
				int asistentes = sc.nextInt();
				while(asistentes > 1000) {
					System.out.println("No puede haber mas de 999"
							+ "\nIntentelo nuevamente");
					asistentes = sc.nextInt();
				}
				
				
				Capacitacion nuevaCapacitacion = new Capacitacion(identificadorCapacitacion, runCliente, dia, hora, lugar, duracion, asistentes);
				capacitaciones.add(nuevaCapacitacion);
				System.out.println("\nIngreso de capacitación Exitosa");
				break;
			}
			case 5:{
				if(contenedor.getUsuarios() == null) {
					System.out.println("No existen Usuarios registrados.");
				}else {
					System.out.println("Ingrese el rut del Usuario que desea eliminar");
					String rutUsuario = sc.nextLine();
					contenedor.eliminarUsuario(rutUsuario);
				}
				System.out.println("\nEnter para volver al menu principal");
				sc.nextLine();
				break;
			}
			case 6:{
				if(contenedor.getUsuarios().isEmpty()) {
					System.out.println("No existen Usuarios registrados.");
				}else {
					contenedor.listarUsuarios();
				}
				System.out.println("\nEnter para volver al menu principal");
				sc.nextLine();
				break;
			}
			
			case 7:{
				if(contenedor.getUsuarios().isEmpty()) {
					System.out.println("No existen Usuarios registrados.");
				}else {
					System.out.println("Ingrese el Tipo de Usuario");
					String tipoUsuario = sc.nextLine();
					while(!tipoUsuario.equalsIgnoreCase("Cliente") && !tipoUsuario.equalsIgnoreCase("Profesional") && !tipoUsuario.equalsIgnoreCase("Administrativo") ) {
						System.out.println("El tipo de usuario a ingresar debe ser: 'Cliente' ó 'Profesional' ó 'Administrativo'"
								+ "\nIntentelo Nuevamente.");
						tipoUsuario = sc.nextLine();
					}
					contenedor.listarUsuariosPorTipo(tipoUsuario);
				}
				System.out.println("\nEnter para volver al menu principal");
				sc.nextLine();
				break;
			}
			
			case 8:{
				if(contenedor.getCapacitaciones().isEmpty()) {
					System.out.println("No existen capacitaciones registradas.");
				}else {
					contenedor.listarCapacitaciones();
				}
				System.out.println("\nEnter para volver al menu principal");
				sc.nextLine();
				break;
			}
			
			case 9:{
				System.out.println("Gracias por usar el programa.");

				break;
			}
			default:
				System.out.println("El número ingresado no es correcto, vuelva a intentarlo");
			}
		System.out.println("");
		} while (eleccionMenu != 9);

		

		sc.close();
	}

}
