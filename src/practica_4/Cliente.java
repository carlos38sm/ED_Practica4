package practica_4;

public class Cliente {
	/*ATRIBUTOS DE LA CLASE CLIENTE*/
	private String dni; 
	private String nombre; 
	private String domicilio;
	
	/*CONSTRUCTOR VACÍO DE LA CLASE CLIENTE*/
	public Cliente() {
		dni = "";
		nombre = "";
		domicilio = ""; 
	}
	
	/*CONSTRUCTOR POR PARÁMENTROS DE LA CLASE CLIENTE*/
	public Cliente(String dni, String nombre, String domicilio) {
		this.dni = dni;
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
	
	/*MÉTODOS GETTER Y SETTER DE LA CLASE CLIENTE*/
	/*ATRIBUTO DNI*/
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	/*ATRIBUTO NOMBRE*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/*ATRIBUTO DOMICILIO*/
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	} 
}
