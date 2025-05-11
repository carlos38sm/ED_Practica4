package practica_4;

public class TestBanco {

	public static void main(String[] args) {
		final String NEGRITA = "\033[1m";				
		final String RESET = "\033[0m";		
		final String AZUL = NEGRITA +  "\033[34m"; 
		
		/*CREACIÓN DE LOS CLIENTES ANTONIO Y BEATRIZ CON EL CONSTRUCTOR POR PARÁMETROS*/
		Cliente antonio = new Cliente("45889384J","Antonio Alonso","Av. Pueblo Sharaui, s/n");
		Cliente beatriz = new Cliente("38569182K","Beatriz Benítez","Calle Sol, 4");
		
		/*CREACIÓN DE LAS CUENTAS PARA AMBOS CLIENTES. CUENTAS CREADAS CON EL CONSTRUCTOR POR PARÁMENTROS*/
		Cuenta cuentaAntonio = new Cuenta("7643 4282 9592 2828", 100, antonio); 
		Cuenta cuentaBeatriz = new Cuenta("1223 2323 6543 9382", 100, beatriz); 
		
		/*ANTONIO Y BEATRIZ CONSULTAN EL SALDO DISPONIBLE EN SU CUENTA*/ 
		System.out.println(NEGRITA+"1. CONSULTA DEL SALDO AL CREAR LA CUENTA"+RESET);
		System.out.println(AZUL+"LA CUENTA DE "+RESET+ cuentaAntonio.getCliente().getNombre() +AZUL+" TIENE "+RESET+ cuentaAntonio.getSaldo() +AZUL+"€."+RESET); 
		System.out.println(AZUL+"LA CUENTA DE "+RESET+ cuentaBeatriz.getCliente().getNombre() +AZUL+" TIENE "+RESET+ cuentaBeatriz.getSaldo() +AZUL+"€."+RESET); 
		
		
		
		
		/*BEATRIZ TRANSFIERE 50 EUROS A ANTONIO*/
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo()-50);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo()+50);
		
		/*ANTONIO Y BEATRIZ VUELVEN A CONSULTAN EL SALDO DISPONIBLE EN SU CUENTA*/ 
		System.out.println();
		System.out.println(NEGRITA+"2. CONSULTA DEL SALDO TRAS LA TRANSFERENCIA BEATRIZ --> ANTONIO"+RESET);
		System.out.println(AZUL+"LA CUENTA DE "+RESET+ cuentaAntonio.getCliente().getNombre() +AZUL+" TIENE "+RESET+ cuentaAntonio.getSaldo() +AZUL+"€."+RESET); 
		System.out.println(AZUL+"LA CUENTA DE "+RESET+ cuentaBeatriz.getCliente().getNombre() +AZUL+" TIENE "+RESET+ cuentaBeatriz.getSaldo() +AZUL+"€."+RESET); 
		
	
		
		
		/*BEATRIZ TIENE QUE PAGAR 30€ A HACIENDA Y RETIRA EL DINERO*/
		/*ANTONIO GANA 100€ EN UNA RIFA E INGRESA EL DINERO*/
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo()-30);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo()+100);
		
		/*ANTONIO Y BEATRIZ VUELVEN A CONSULTAN EL SALDO DISPONIBLE EN SU CUENTA*/ 
		System.out.println();
		System.out.println(NEGRITA+"3. CONSULTA DEL SALDO TRAS LAS OPERACIONES DE RIFA Y HACIENDA"+RESET);
		System.out.println(AZUL+"LA CUENTA DE "+RESET+ cuentaAntonio.getCliente().getNombre() +AZUL+" TIENE "+RESET+ cuentaAntonio.getSaldo() +AZUL+"€."+RESET); 
		System.out.println(AZUL+"LA CUENTA DE "+RESET+ cuentaBeatriz.getCliente().getNombre() +AZUL+" TIENE "+RESET+ cuentaBeatriz.getSaldo() +AZUL+"€."+RESET); 
		
		
		/*ANTONIO TRANSFIERE 50€ A BEATRIZ*/
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo()+50);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo()-50);
		
		/*ANTONIO Y BEATRIZ VUELVEN A CONSULTAN EL SALDO DISPONIBLE EN SU CUENTA*/ 
		System.out.println();
		System.out.println(NEGRITA+"4. CONSULTA DEL SALDO TRAS LAS OPERACIONES DE RIFA Y HACIENDA"+RESET);
		System.out.println(AZUL+"LA CUENTA DE "+RESET+ cuentaAntonio.getCliente().getNombre() +AZUL+" TIENE "+RESET+ cuentaAntonio.getSaldo() +AZUL+"€."+RESET); 
		System.out.println(AZUL+"LA CUENTA DE "+RESET+ cuentaBeatriz.getCliente().getNombre() +AZUL+" TIENE "+RESET+ cuentaBeatriz.getSaldo() +AZUL+"€."+RESET); 
	}
}