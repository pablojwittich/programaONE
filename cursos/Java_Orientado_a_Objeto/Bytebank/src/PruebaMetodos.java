public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta cuentaPablo = new Cuenta();
		Cuenta cuentaBelen = new Cuenta();
		
		// Metodo depositar 
		cuentaBelen.depositar(1000);
		cuentaPablo.depositar(1000);
		System.out.println("Saldo Belén es de $" + cuentaBelen.saldo + " Saldo Pablo es de $" + cuentaPablo.saldo);
		
		// Metodo retirar 
		cuentaBelen.retirar(500);
		cuentaPablo.retirar(200);
		
		// Metodo Transferir
		cuentaBelen.transferir(600, cuentaPablo);
	}
}
