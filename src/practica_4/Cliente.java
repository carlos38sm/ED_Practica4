package practica_4;

/**
 * Clase que permite crear clientes. 
 * Permite asignarle atributos de: dni, nombre y domicilio. 
 * Permite acceder y mostrar los datos del cliente. 
 * 
 * @version Cuarto Commit. 
 * @author Carlos Sánchez Miranda*/

public class Cliente {
	/*ATRIBUTOS DE LA CLASE CLIENTE*/
	private String dni; 
	private String nombre; 
	private String domicilio;
	
	/*CONSTRUCTOR VACÍO DE LA CLASE CLIENTE*/
	/**
	 * Constructor vacío. Contiene los valores por defecto. 
	 **/
	public Cliente() {
		dni = "";
		nombre = "";
		domicilio = ""; 
	}
	
	/*CONSTRUCTOR POR PARÁMETROS DE LA CLASE CLIENTE*/
	/**
	 * Constructor por parámetros.
	 * @param dni Contiene el DNI del cliente
	 * @param nombre Contiene el nombre completo del cliente
	 * @param domicilio Asigna la dirección del cliente*/
	public Cliente(String dni, String nombre, String domicilio) {
		this.dni = dni;
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
	
	/*MÉTODOS GETTER Y SETTER DE LA CLASE CLIENTE*/
	/*ATRIBUTO DNI*/
	/**
	 * Permite obtener el valor del dni.
	 * @return dni Devuelve el dni*/
	public String getDni() {
		return dni;
	}
	
	/**
	 * Modifica el valor del dni.
	 * @param dni Inserta nuevo dni*/
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	/*ATRIBUTO NOMBRE*/
	/**
	 * Obtiene el valor del nombre
	 * @return nombre Devuelve el nombre*/
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Modifica el valor del nombre
	 * @param nombre Inserta nuevo nombre*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/*ATRIBUTO DOMICILIO*/
	/**
	 * Permite obtener el valor del domicilio
	 * @return domicilio Obtención del domicilio*/
	public String getDomicilio() {
		return domicilio;
	}
	
	/**
	 * Permite modificar el valor del domicilio
	 * @param domicilio Insertar nuevo domicilio*/
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	} 
}