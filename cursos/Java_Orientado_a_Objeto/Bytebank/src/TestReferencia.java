public class TestReferencia {
	public static void main(String[] args) {
		
		Cuenta diegoCuenta = new Cuenta();
		diegoCuenta.salario = 100;
		System.out.println("El saldo de la primera cuenta es " + diegoCuenta.salario);
		
		Cuenta aluraCuenta = diegoCuenta;
		aluraCuenta.salario = 200;
		System.out.println( "El saldo de la segunda cuenta es " + aluraCuenta.salario);
		
		// Para saber si el valor del saldo cambio
		System.out.println("El saldo de la primera cuenta es " + diegoCuenta.salario);
	}
}
