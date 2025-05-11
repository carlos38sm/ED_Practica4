package practica_4;

/**
 * Esta clase simula el funcionamiento de un banco.
 * Refleja el flujo de operaciones entre clientes y cuentas.
 * Realiza operaciones de: transferencia, extracción e ingreso.
 * 
 * @version Tercer Commit.
 * @author Carlos Sánchez Miranda.*/
public class TestBanco {
		/*EXTRACCIÓN DE CONSTANTES MEDIANTE REFACTORIZACIÓN*/
		private static final int CIEN = 100;

		
		public static void main(String args[]) {
			/*CONSTANTES DE COLORES PARA VISUALIZAR EL CÓDIGO*/
			final String NEGRITA = "\033[1m";				
			final String RESET = "\033[0m";		
			final String AZUL = NEGRITA +  "\033[34m"; 
			
			
			
			/*EXTRACCIÓN DE VARIABLES LOCALES MEDIANTE REFACTORIZACIÓN*/
			String cuenta = "LA CUENTA DE ";
			String tiene = " TIENE ";
			String euro = "€.";

			
			
			/*CREACIÓN DE LOS CLIENTES ANTONIO Y BEATRIZ CON EL CONSTRUCTOR POR PARÁMETROS*/
			Cliente antonio = new Cliente("45889384J","Antonio Alonso","Av. Pueblo Sharaui, s/n");
			Cliente beatriz = new Cliente("38569182K","Beatriz Benítez","Calle Sol, 4");
			
			/*CREACIÓN DE LAS CUENTAS PARA AMBOS CLIENTES. CUENTAS CREADAS CON EL CONSTRUCTOR POR PARÁMENTROS*/
			Cuenta cuentaAntonio = new Cuenta("2398 1237 9864 2733",CIEN,antonio); 
			Cuenta cuentaBeatriz = new Cuenta("9229 0583 8402 8486",CIEN,beatriz); 
			
			/*ANTONIO Y BEATRIZ CONSULTAN EL SALDO DISPONIBLE EN SU CUENTA*/ 
			System.out.println(NEGRITA+"1. CONSULTA DEL SALDO AL CREAR LA CUENTA"+RESET);
			System.out.println(AZUL+cuenta+RESET+ cuentaAntonio.getCliente().getNombre() +AZUL+tiene+RESET+ cuentaAntonio.getSaldo() +AZUL+euro+RESET); 
			System.out.println(AZUL+cuenta+RESET+ cuentaBeatriz.getCliente().getNombre() +AZUL+tiene+RESET+ cuentaBeatriz.getSaldo() +AZUL+euro+RESET); 
			
			
			
			
			/*BEATRIZ TRANSFIERE 50 EUROS A ANTONIO*/
			transferirSaldo(cuentaBeatriz, cuentaAntonio, 50);

			
			/*ANTONIO Y BEATRIZ VUELVEN A CONSULTAN EL SALDO DISPONIBLE EN SU CUENTA*/ 
			System.out.println();
			System.out.println(NEGRITA+"2. CONSULTA DEL SALDO TRAS LA TRANSFERENCIA BEATRIZ --> ANTONIO"+RESET);
			System.out.println(AZUL+cuenta+RESET+ cuentaAntonio.getCliente().getNombre() +AZUL+tiene+RESET+ cuentaAntonio.getSaldo() +AZUL+euro+RESET); 
			System.out.println(AZUL+cuenta+RESET+ cuentaBeatriz.getCliente().getNombre() +AZUL+tiene+RESET+ cuentaBeatriz.getSaldo() +AZUL+euro+RESET); 
			
		
			
			/*BEATRIZ TIENE QUE PAGAR 30€ A HACIENDA Y RETIRA EL DINERO*/
			/*ANTONIO GANA 100€ EN UNA RIFA E INGRESA EL DINERO*/
			extraerSaldo(cuentaBeatriz, 30);
			ingresarSaldo(cuentaAntonio, 100);
			
			/*ANTONIO Y BEATRIZ VUELVEN A CONSULTAN EL SALDO DISPONIBLE EN SU CUENTA*/ 
			System.out.println();
			System.out.println(NEGRITA+"3. CONSULTA DEL SALDO TRAS LAS OPERACIONES DE RIFA Y HACIENDA"+RESET);
			System.out.println(AZUL+cuenta+RESET+ cuentaAntonio.getCliente().getNombre() +AZUL+tiene+RESET+ cuentaAntonio.getSaldo() +AZUL+euro+RESET); 
			System.out.println(AZUL+cuenta+RESET+ cuentaBeatriz.getCliente().getNombre() +AZUL+tiene+RESET+ cuentaBeatriz.getSaldo() +AZUL+euro+RESET); 
			
			
			
			
			/*ANTONIO TRANSFIERE 50€ A BEATRIZ*/
			transferirSaldo(cuentaAntonio, cuentaBeatriz, 50);

			
			/*ANTONIO Y BEATRIZ VUELVEN A CONSULTAN EL SALDO DISPONIBLE EN SU CUENTA*/ 
			System.out.println();
			System.out.println(NEGRITA+"4. CONSULTA DEL SALDO TRAS LA TRANSFERENCIA DE ANTONIO --> BEATRIZ"+RESET);
			System.out.println(AZUL+cuenta+RESET+ cuentaAntonio.getCliente().getNombre() +AZUL+tiene+RESET+ cuentaAntonio.getSaldo() +AZUL+euro+RESET); 
			System.out.println(AZUL+cuenta+RESET+ cuentaBeatriz.getCliente().getNombre() +AZUL+tiene+RESET+ cuentaBeatriz.getSaldo() +AZUL+euro+RESET); 
		}

		
		
		/* EXTRACCIÓN DE MÉTODOS MEDIANTE REFACTORIZACIÓN*/
		/* MÉTODO DE INGRESO DE SALDO*/
		
		/**
		 * Ingresa una cantidad de dinero a una cuenta. Añade saldo al monto actual.
		 * 
		 * @param cuenta Cuenta a la que se le ingresa el dinero.
		 * @param cantidad Cantidad de dinero que se ingresa.*/
		private static void ingresarSaldo(Cuenta cuenta, int cantidad) {
			cuenta.setSaldo(cuenta.getSaldo() + cantidad);
		}

		
		/* MÉTODO DE EXTRACCIÓN DE SALDO*/
		
		/**
		 * Extrae una cantidad determinada de dinero de una cuenta. Resta saldo al monto actual.
		 * 
		 * @param cuenta Cuenta de la que se extrae el dinero.
		 * @param cantidad Cantidad de dinero que se extrae.
		*/
		private static void extraerSaldo(Cuenta cuenta, int cantidad) {
			cuenta.setSaldo(cuenta.getSaldo() - cantidad);
		}

		
		/* MÉTODO DE TRANSFERENCIA DE SALDO*/
		
		/**
		 * Transfiere un saldo determinado entre dos cuentas. 
		 * 
		 * @param origen Cuenta de la que se extrae el dinero.
		 * @param destino Cuenta que recibe el dinero.
		 * @param cantidad Cantidad de dinero transferido.*/
		private static void transferirSaldo(Cuenta origen, Cuenta destino, int cantidad) {
			origen.setSaldo(origen.getSaldo() - cantidad);
			destino.setSaldo(destino.getSaldo() + cantidad);
		}
}