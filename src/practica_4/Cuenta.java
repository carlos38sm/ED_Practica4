package practica_4;

/**
 * Esta clase representa una cuenta bancaria. 
 * Contiene atributos como: numero de cuenta, saldo y cliente.
 * Permite crear objetos de tipo Cuenta, modificarlos y verlos.
 * 
 * @version Cuarto Commit.
 * @author Carlos Sánchez Miranda*/
public class Cuenta {
	/*ATRIBUTOS PROPIOS DE LA CLASE CUENTA*/
	private String numero_cuenta; 
	private int saldo;
	private Cliente cliente;
	
	
	/*CONSTRUCTOR VACÍO DE LA CLASE CUENTA. TIENE POR DEFECTO SALDO EN 100€*/
	/**
	 * Constructor vacío. Añade 100€ por defecto al instanciar un objeto de tipo Cuenta. 
	 **/
	public Cuenta() {
		numero_cuenta = ""; 
		saldo = 100; //POR DEFECTO SON 100€ AL INICIAR UNA NUEVA CUENTA
		cliente = new Cliente(); 
	}

	
	/*CONSTRUCTOR POR PARÁMETROS*/
	/**
	 * Constructor por parámentros
	 * @param numero_cuenta Parámetro que formaliza el ID de una cuenta
	 * @param saldo Contiene la cuantía monetaria depositada en una cuenta
	 * @param cliente Asigna un cliente a una cuenta*/
	public Cuenta(String numero_cuenta, int saldo, Cliente cliente) {
		super();
		this.numero_cuenta = numero_cuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	
	/*SE GENERAN LOS MÉTODOS SETTER Y GETTERS PARA LOS ATRIBUTOS DE LA CLASE CUENTA*/
	/*ATRIBUTO NUMERO_CUENTA*/
	
	/**
	 * Permite obtener el valor del atributo numero_cuenta
	 * @return numero_cuenta Devuelve el numero_cuenta de una cuenta*/
	public String getNumero_cuenta() {
		return numero_cuenta;
	}
	
	/**
	 * Permite modificar el valor del atributo numero_cuenta
	 * @param numero_cuenta Permite modificar el numero_cuenta de una cuenta*/
	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	
	
	/*ATRIBUTO SALDO*/
	/**
	 * Permite obtener el valor del atributo saldo
	 * @return saldo Devuelve el saldo de una cuenta*/
	public int getSaldo() {
		return saldo;
	}
	
	/**
	 * Modifica el valor del atributo saldo
	 * @param saldo Permite modificar el saldo de una cuenta*/
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	
	
	/*ATRIBUTO CLIENTE*/
	/**
	 * Obtiene el valor del atributo cliente
	 * @return cliente Devuelve un cliente asociado a una cuenta*/
	public Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * Permite modificar el valor del atributo cliente
	 * @param cliente Modifica un cliente asociado a una cuenta*/
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	} 
}