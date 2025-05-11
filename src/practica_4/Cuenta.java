package practica_4;

public class Cuenta {
	/*ATRIBUTOS PROPIOS DE LA CLASE CUENTA*/
	private String numero_cuenta; 
	private int saldo;
	private Cliente cliente;
	
	
	/*CONSTRUCTOR VACÍO DE LA CLASE CUENTA. TIENE POR DEFECTO SALDO EN 100€*/
	public Cuenta() {
		numero_cuenta = ""; 
		saldo = 100; //POR DEFECTO SON 100€ AL INICIAR UNA NUEVA CUENTA
		cliente = new Cliente(); 
	}

	/*CONSTRUCTOR POR PARÁMETROS*/
	public Cuenta(String numero_cuenta, int saldo, Cliente cliente) {
		super();
		this.numero_cuenta = numero_cuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	
	/*SE GENERAN LOS MÉTODOS SETTER Y GETTERS PARA LOS ATRIBUTOS DE LA CLASE CUENTA*/
	/*ATRIBUTO NUMERO_CUENTA*/
	public String getNumero_cuenta() {
		return numero_cuenta;
	}
	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	/*ATRIBUTO SALDO*/
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/*ATRIBUTO CLIENTE*/
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	} 
}
