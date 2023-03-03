public class TestReferencia {
	public static void main(String[] args) {
		
		Cuenta diegoCuenta = new Cuenta();
		diegoCuenta.saldo = 100;
		System.out.println("El saldo de la primera cuenta es " + diegoCuenta.saldo);
		
		Cuenta aluraCuenta = diegoCuenta;
		aluraCuenta.saldo = 200;
		System.out.println( "El saldo de la segunda cuenta es " + aluraCuenta.saldo);
		
		// Para saber si el valor del saldo cambio
		System.out.println("El saldo de la primera cuenta es " + diegoCuenta.saldo);
	}
}
